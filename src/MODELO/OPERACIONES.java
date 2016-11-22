/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class OPERACIONES {

    public OPERACIONES() {
    }
     
    
    public void factorial(){
        int factorial = 0;
        
        for (int i=1; i<=10; i++ ){
            for(int j=1; j<=i; j++){
                factorial = factorial*j;
            }
            JOptionPane.showMessageDialog(null, "Factorial de "+i+" = "+factorial);
            factorial = 1;
        }
    }
    
}
