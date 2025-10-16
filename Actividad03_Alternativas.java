/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividad03_alternativas;

/**
 *
 * @author DAW1
 */
import javax.swing.JOptionPane;

public class Actividad03_Alternativas {

    public static void main(String[] args) {
        
        String resp = JOptionPane.showInputDialog("Número 1");
        int numero1 = Integer.parseInt(resp);
        
        String resp2 = JOptionPane.showInputDialog("Número 2");
        int numero2 = Integer.parseInt(resp);
        
        int mayor;
        
        if (numero1 < numero2){
            mayor = numero1;
        } else {
            mayor = numero2;
        if (numero2 < numero1){
       
        }
  
        }
        
        JOptionPane.showMessageDialog(null,
                """
                <html>
                <h1>El número mayor es: 
                <br /> %d</h1>
                </html>
                """.formatted(numero1, numero2, mayor));
    }
}
