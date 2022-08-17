package com.christopherAdasme.catalogo;

import com.christopherAdasme.catalogo.enums.Fabricantes;
import com.christopherAdasme.catalogo.interfaces.IProducto;
import com.christopherAdasme.catalogo.model.*;

import java.util.Date;

public class MainCatagolo {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[4];
        productos[0] = new TvLcd(500000,Fabricantes.SAMSUNG,55);
        productos[1] = new IPhone(649990,Fabricantes.APPLE,"XL","Blanco");
        productos[2] = new Libro(15000, new Date(2022,03,01),"Christopher Adasme","El hobbit","Planet books");
        productos[3] = new Comic(6000,new Date(1999,03,3),"Marvel","The Amazing Spiderman", "Ovni press","Spiderman");
        int i=0;
        System.out.println("Productos");
        for (IProducto producto :
                productos) {
            i++;
            System.out.println(" ["+i+"] "+producto);
        }
    }

}
