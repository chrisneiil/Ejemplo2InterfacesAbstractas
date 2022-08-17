package com.christopherAdasme.catalogo.model;

import com.christopherAdasme.catalogo.enums.Fabricantes;
import com.christopherAdasme.catalogo.interfaces.IElectronico;

public class Electronico extends  Producto implements IElectronico {
    private Fabricantes fabricante;

    public Electronico(int precio, Fabricantes fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public Fabricantes getFabricante(){
        return fabricante;
    }

    public void setFabricante(Fabricantes fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }

    @Override
    public String toString() {
        return "Electronico{" +
                "fabricante='" + fabricante + '\'' +
                "precio= " + this.getPrecio();
    }
}
