package com.gamis214;


public class Persona {

    private int cuenta;
    private String nombre;
    private double monto;

    public Persona(int cuenta,String nombre,double monto){
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.monto = monto;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
