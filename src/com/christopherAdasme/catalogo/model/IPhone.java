package com.christopherAdasme.catalogo.model;

import com.christopherAdasme.catalogo.enums.Fabricantes;
import com.christopherAdasme.catalogo.interfaces.IElectronico;

public class IPhone extends Electronico {
   private String modelo;
   private String color;


    public IPhone(int precio, Fabricantes fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "IPhone " +
                " modelo= " + modelo +
                " color= " + color  +
                " Precio = " + getPrecioVenta()+
                " Fabricante = " + getFabricante();
    }
}
