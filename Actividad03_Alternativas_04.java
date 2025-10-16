/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividad03_alternativas_04;

/**
 *
 * @author DAW1
 */
import javax.swing.JOptionPane;

public class Actividad03_Alternativas_04 {

    public static void main(String[] args) {
       
        String resp1 = JOptionPane.showInputDialog("Número 1");
        int numero1 = Integer.parseInt(resp1); 
        
        String resp2 = JOptionPane.showInputDialog("Número 2");
        int numero2 = Integer.parseInt(resp2);
        
        int menor;
        
        if (numero1 > numero2){
            menor = numero1;
        } else {
            menor = numero2;
     
       
        }
        
            
        JOptionPane.showMessageDialog(null,
                """
                <html>
                <h1>El número menor es: 
                <br /> %d</h1>
                </html>
                """.formatted(numero1, numero2));
            
        }
    }

