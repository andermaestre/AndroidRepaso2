package com.example.repaso2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vendedor {
    private int Codigo;
    private String Nombre;
    private String Apellido;
    private ArrayList<Venta> Ventas= new ArrayList<Venta>();

    public Vendedor(int c, String n, String a)
    {
        this.Nombre=n;
        this.Apellido=a;
        this.Codigo=c;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void registrarVenta(int m, float i)
    {
        this.Ventas.add(new Venta(m,i));
    }
    public ArrayList<AcumuladoVentas> getVentas()
    {
        ArrayList<AcumuladoVentas> auxVentas=new ArrayList<AcumuladoVentas>();

        for(int i = 0; i < 12 ; i++){
            float aux = 0;
            for (Venta v:Ventas) {
                if(v.mes==i+1){
                    aux+=v.importe;
                }
            }
            auxVentas.add(new AcumuladoVentas(i+1,aux));
        }
        return auxVentas;

    }
}
