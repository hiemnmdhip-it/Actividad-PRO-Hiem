/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad02_02_alumno;

/**
 *
 * @author DAW1
 */
public class Alumno {
    public String nombre;
    public String curso;
    public char seccion;
    public int nota1;
    public int nota2;
    public int nota3;
    public boolean repetidor;
    
    public double media(){
        double media = (this.nota1 + this.nota2 + this.nota3) / 3.0;
        return media;
    }
    
    public boolean aprobado(){
        return (this.nota1 >= 5 && this.nota2 >= 5 && this.nota3 >=5);
    }
    
    public boolean mediaSuperiorA(double media){
        return this.media() > media;
    }
    
    public boolean suspendeAlgo(){
        //return (this.nota1 < 5 || this.nota2 < 5 || this.nota3 < 5);
       return !this.aprobado(); //pilla el aprobado y le da la vuelta (de aprobado a suspendido)
    }
}

