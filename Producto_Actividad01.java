/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad01;

/**
 *
 * @author DAW1
 */
public class Producto {
  
    public String nombre; 
    public int precio;
    
    public void mostrar(){
        
        System.out.println("Nombre de producto " + nombre);
        System.out.println("Precio de producto " + precio + "€");
    }
    
    public int getImporte (int unidades){
    return unidades * precio;
    }
    
    public double getImporteConIva(int unidades){
        return this.getImporte(unidades) * 1.21;
    }
}
