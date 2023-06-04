package com.priv;

public class Persona {
    private int edad;
    private String nombre;
    private int telefono;


    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setEdad(int edadIngresada){
        this.edad = edadIngresada;
    }

    public void setNombre(String nombreIngresado){
        this.nombre = nombreIngresado;
    }

    public void setTelefono(int telefonoIngresado){
        this.telefono = telefonoIngresado;
    }
}
