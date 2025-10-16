/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad02;

/**
 *
 * @author DAW1
 */
public class Videojuego {
    public String nombre;
    public String plataforma;
    public String género;
    public int puntuación;
    
  public boolean esRecomendable(){
      return this.puntuación >= 8;

    
  } 
}
