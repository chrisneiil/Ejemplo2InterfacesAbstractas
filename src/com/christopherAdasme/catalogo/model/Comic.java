package com.christopherAdasme.catalogo.model;

import java.util.Date;

public class Comic extends Libro{
    private String personaje;

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "Comic : " + getTitulo() +
                " Autor : " + getAutor() +
                " Feccha publicacion =" + getFechaPulicacion() +
                " Editorial = "+ getEditorial() +
                " Precio = " + getPrecioVenta() +
                " Personaje = " + getPersonaje();
    }
}
