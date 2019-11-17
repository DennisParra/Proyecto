/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.view;

import ec.edu.espe.FastPay.controller.Entry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FastPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entry entry = new Entry();
        
        Scanner enter = new Scanner(System.in);
      
        int option;
        char respuesta;
       
        do{
            System.out.println("1. Enter");
            System.out.println("2. Modify");
            System.out.println("3. Delite");
            System.out.println("4. See");
            System.out.println("5. Exit");
            
            option = Integer.parseInt(JOptionPane.showInputDialog("Type an option: "));
            switch(option){
                case 1:
                    entry.enter();
                    break;
                case 2: 
                    //modify
                    break;
                case 3:
                    //Delite
                    break;
                case 4:
                    //see
                    break;
                case 5: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Invalid option\n\n");
            }
        }while(option != 5);
 
    }        
}
