package com.christopherAdasme.catalogo.model;

import com.christopherAdasme.catalogo.enums.Fabricantes;

public class TvLcd extends  Electronico{
    private int pulgada;

    public TvLcd(int precio, Fabricantes fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "Precio :" + this.getPrecio() + " Fabricante : "
                + getFabricante() + " Pulgadas: " + getPulgada();
    }
}
