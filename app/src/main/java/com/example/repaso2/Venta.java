package com.example.repaso2;

public class Venta {
    int mes;
    float importe;

    public Venta(int m, float imp) {
        this.mes = m;
        this.importe = imp;
    }

    public float getImporte() {
        return importe;
    }

    public int getMes() {
        return mes;
    }
}

