/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividado02_02;




/**
 *
 * @author DAW1
 */

public class Actividado02_02 {

    public static void main(String[] args) {
      Trabajo t = new Trabajo();
      t.cliente = "Ibex,S.L."; // Instancia --> objeto.prop / objeto.metodo()
      System.out.println(Trabajo.IVA); // Clase --> Clase.prop / Clase.metodo()
      t.horas = 60;
      t.km = 250;
      t.precioHora = 35.5;
      t.precioKm = 3.5;
      
      t.cliente = 
      
      t.factura(); 
      
       
       /*
       Porcentaje de importeKm respecto al total SIN IVA
       */
       
       double porc = t.importeKm() / t.importeTotal() * 100;
        System.out.println("El importe de los Km supone un %5.2f%%".formatted(porc));
        
    }
    
}
