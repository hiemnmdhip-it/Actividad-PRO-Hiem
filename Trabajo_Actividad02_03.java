/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividado02_02;



/**
 *
 * @author DAW1
 */



public class Trabajo {
    
  public String cliente;
  public double precioHora;
  public double precioKm;
  public double horas;
  public int km;
  public static final double IVA = 0.21;
  public static final int SALIDA = 50;
  
  public double importeHoras(){
      double importe = this.horas * this.precioHora;
      return importe;
      
  }
  
  public double importeKm(){
      return (this.km-10) * this.precioKm;
      
  }
  
  public double importeTotal(){
      return this.importeHoras() + this.importeKm() + Trabajo.SALIDA;
  }
  
  public double iva(){
      return importeTotal() * Trabajo.IVA;
      
  }
  
  public double importeTotalIva(){
      return this.importeTotal() + this.iva();
      
  }
  
  public void factura(){
      System.out.println(
              """
              Cliente : %s
              Horas Trabajadas             : %10.2f           Precio Hora : %5.2f€    Importe : %,10.2f€
              Km. Desplazamiento           : %,9d            Precio Km.  : %5.2f€    Importe : %,10.2f€
              Total Factura                : %,10.2f€
              I.V.A. (IVA%%)                : %,10.2f€
              Total Factura (IVA incluído) : %,10.2f€
              """.formatted(
                      this.cliente,
                      this.horas,
                      this.precioHora,
                      this.importeHoras(),
                      this.km,
                      this.precioKm,
                      this.importeKm(),
                      this.importeTotal(),
                      this.iva(),
                      this.importeTotalIva()
                      
              )
              );
      
      /*  System.out.printf(
             """
              Cliente : %s
              Horas Trabajadas : %3d    Precio Hora : %.2f      Importe : %,.2f
              Km. Desplazamiento : %,4d            Precio Km. : %.2f       Importe : %,.2f
              Total Factura : %,.2f
              I.V.A. (IVA%%) : %,.2f
              Total Factura (IVA incluído) : %,.2f
              """,
              this.cliente,
              this.horas,
              this.precioHora,
              this.importeHoras(),
              this.km,
              this.precioKm,
              this.importeKm(),
              this.importeTotal(),
              this.iva(),
              this.importeTotalIva() 
                      
              
              ); */
  }
}
