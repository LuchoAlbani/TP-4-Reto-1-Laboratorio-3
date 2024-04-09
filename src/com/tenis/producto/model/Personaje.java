package com.tenis.producto.model;

public class Personaje{

    private String nombre;

    private String nacionalidad;

    private Float edad;

    private String manoDominante;

    public Personaje(){

    }

    public Personaje(String nombre, String nacionalidad, Float edad, String manoDominante) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.manoDominante = manoDominante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Float getEdad() {
        return edad;
    }

    public void setEdad(Float edad) {
        this.edad = edad;
    }

    public String getManoDominante() {
        return manoDominante;
    }

    public void setManoDominante(String manoDominante) {
        this.manoDominante = manoDominante;
    }


}
