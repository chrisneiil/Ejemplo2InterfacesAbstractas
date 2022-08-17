package com.christopherAdasme.catalogo.model;

import com.christopherAdasme.catalogo.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    @Override
    public String toString() {

        return  "Titulo = " + titulo +
                " Fecha publicacion = " + fechaPublicacion +
                " Autor = " + autor +
                " Editorial = " + editorial +
                " Precio = " + getPrecio() ;
    }

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public Date getFechaPulicacion() {
        return fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }
}
