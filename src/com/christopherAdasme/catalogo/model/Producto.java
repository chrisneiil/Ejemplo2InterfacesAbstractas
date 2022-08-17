package com.christopherAdasme.catalogo.model;

import com.christopherAdasme.catalogo.interfaces.IProducto;

public abstract class Producto implements IProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
}
