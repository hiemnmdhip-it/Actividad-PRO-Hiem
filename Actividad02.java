/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividad02;

/**
 *
 * @author DAW1
 */
public class Actividad02 {

    public static void main(String[] args) {
       Videojuego juego1 = new Videojuego();
       Videojuego juego2 = new Videojuego();
       Videojuego juego3 = new Videojuego();
       
       juego1.nombre = "Devil May Cry 5";
       juego1.plataforma = "PS5";
       juego1.género = "Hack and slash";
       juego1.puntuación = 10;
       
       juego2.nombre = "Tekken 8";
       juego2.plataforma = "Xbox Series X";
       juego2.género = "Lucha";
       juego2.puntuación = 7;
       
       juego3.nombre = "God of War Ragnarok";
       juego3.plataforma = "PS4";
       juego3.género = juego1.género;
       juego3.puntuación = 9;
     
       
       
        
         Videojuego masAltaPuntuacion = juego1.puntuación > juego2.puntuación
                      ?juego1:juego2;
        
        System.out.println("El videojuego " + masAltaPuntuacion.nombre + 
                " es el que tiene mayor puntuacion ( " + masAltaPuntuacion.puntuación
                + "puntos )"); 
        
        
        System.out.println("Los videojuegos " + 
                (juego1.plataforma.equalsIgnoreCase(juego2.plataforma)?" ":"no ") +
                "son de la misma plataforma");
        
       
        
        System.out.println("El juego " + juego1.nombre +
                (juego1.esRecomendable()?" es ":" no es " + "recomendable"));
          System.out.println("El juego " + juego2.nombre +
                (juego2.esRecomendable()?" es ":" no es " + "recomendable")); 

        
        String mismoGenero = ((juego1.género.equalsIgnoreCase(juego2.género)
                ?juego1.nombre + " y " + juego2.nombre + " pertenecen al mismo género "
                :juego1.nombre + " y " + juego2.nombre + " no pertenecen al mismo género "));
        System.out.println(mismoGenero);
        
        
        /* ADICIONAL */
       double media = (juego1.puntuación + juego2.puntuación + juego3.puntuación) / 3.0;
        System.out.println("La puntuación media de los juegos es : " + media);
        
      String plataforma = "PS5";
      int cuenta = 0;
      cuenta = cuenta + (juego1.plataforma.equalsIgnoreCase(plataforma)?1:0);
      cuenta = cuenta + (juego2.plataforma.equalsIgnoreCase(plataforma)?1:0);
      cuenta = cuenta + (juego3.plataforma.equalsIgnoreCase(plataforma)?1:0);
      System.out.println("Hay " + cuenta +  (cuenta == 1?" juego":" juegos") + " de " + plataforma);
      
      boolean condicion1 = (juego1.plataforma.equalsIgnoreCase("PS5") ||
              juego1.plataforma.equalsIgnoreCase("PS4"))
              &&
              juego1.puntuación >=7;
        System.out.println("El juego " + juego1.nombre +
                (condicion1?" CUMPLE ":" NO CUMPLE ") + "con la condición de que la plataforma sea MAYOR O IGUAL que");
        
        boolean condicion2 = (juego1.plataforma.equalsIgnoreCase("PS5") ||
              juego1.plataforma.equalsIgnoreCase("PS5"))
              &&
              juego1.puntuación >=10;
        System.out.println("El juego " + juego1.nombre +
                (condicion2?" CUMPLE ":" NO CUMPLE ") + "con la condición de que la plataforma sea MAYOR O IGUAL que");
        
        boolean condicion3 = (juego3.puntuación >=7 && juego3.puntuación <= 9)
                &&
                juego3.esRecomendable();
        
        
        System.out.println("El juego " + juego3.nombre +
                  (condicion3 ? " SÍ " : " NO ") + 
                  "cumple la condición de tener entre 7 y 9 puntos y ser recomendable.");
        
        Videojuego puntuaciónMasAlta = juego1.puntuación > juego2.puntuación
                ? (juego1.puntuación > juego3.puntuación ? juego1 : juego3)
                : (juego2.puntuación > juego3.puntuación ? juego2 : juego3);
    } 
    
   
    
    
    
   
}
