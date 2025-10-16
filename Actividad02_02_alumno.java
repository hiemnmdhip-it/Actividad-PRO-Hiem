/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividad02_02_alumno;

/**
 *
 * @author DAW1
 */
public class Actividad02_02_alumno {

    public static void main(String[] args) {
       Alumno a = new Alumno();
       a.curso = "DAW1";
       a.nombre = "Vergil Sparda";
       a.nota1 = 7;
       a.nota2 = 4;
       a.nota3 = 9;
       a.repetidor = true;
       a.seccion = 'A';
       
     System.out.printf("La nota media de %s es %.2f\n", a.nombre, a.media());
     System.out.println("El alumno %s está aprobado".formatted(
                a.aprobado()?"":"no")); 
     
     boolean cumple = a.curso.equalsIgnoreCase("DAW1") &&
             (a.seccion == 'a' || a.seccion == 'A');
     System.out.println("El curso es \"DAW1\" y la sección es 'A' : %s"
          .formatted((cumple?"Sí":"No")));
     
     cumple = a.repetidor && a.nota1 < 5;
     System.out.println("El alumno es repetidor y tiene suspendida la nota1 : %s" .formatted((cumple?"Sí":"No")));
        
     System.out.println("Ha suspendido alguna asignatura : %s" .formatted(a.suspendeAlgo()?"Sí":"No"));
        
     cumple = (a.curso.equalsIgnoreCase("DAW1") || a.curso.equalsIgnoreCase("ASIR1"))
           && ((a.seccion == 'b' || a.seccion == 'A')
           || (a.seccion == 'b' || a.seccion == 'B'));
        
    System.out.println("Curso \"DAW1\" o \"ASIR1\" y sección 'A' o 'B': %s" .formatted(a.suspendeAlgo()?"Sí":"No"));
    
    boolean nota1MasAlta = a.nota1 > a.nota2 && a.nota1 > a.nota3;
    
    System.out.println("La nota1 %s la más alta" 
           .formatted(nota1MasAlta?"es":"no es"));
    
    double notaFinal = a.nota1 * 0.3 +a.nota2 * 0.5 + a.nota3 * 0.2;
        System.out.println("La nota final es &s");
    
    int notaMasAlta = a.nota1>a.nota2?(a.nota1>a.nota3?a.nota1:a.nota3)
            :(a.nota2>a.nota3?a.nota2:a.nota3);

            

      
    
        
        
  
      
    }
}
