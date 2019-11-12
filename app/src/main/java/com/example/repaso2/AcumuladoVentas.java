package com.example.repaso2;

public class AcumuladoVentas {
    int mes;
    float total;
    AcumuladoVentas(int m,float t)
    {
        this.mes=m;
        this.total=t;
    }

    public int getMes()
    {
        return mes;
    }

    public float getTotal()
    {
        return total;
    }
}
