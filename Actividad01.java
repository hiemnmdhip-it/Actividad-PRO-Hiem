/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividad01;

/**
 *
 * @author DAW1
 */
public class Actividad01 {

    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        
        p1.nombre = "papel";
        p1.precio = 2;
        
        p2.nombre = "leche";
        p2.precio = 1;
        
        p1.mostrar();
        p2.mostrar();
        
        int unidades = 5;
        
        int importe1 = p1.getImporte(unidades);
        int importe2 = p2.getImporte(unidades);
        
        
       
        
        System.out.println("Vendidas " + unidades + " unidades de " + p1.nombre 
                + " (precio : " +  p1.precio +"). Importe : " + importe1 + "€");
        
        System.out.println("Vendidas " + unidades + " unidades de " + p2.nombre 
                + " (precio : " + p2.precio +"). Importe : " + importe2 + "€");
        
        
    }
}
