/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.controller;

import static ec.edu.espe.FastPay.controller.Provider.enter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Entry {
    
    ArrayList<Entry> entry = new ArrayList<Entry>();
    
    Scanner enter = new Scanner (System.in);
    
    private int id_article;
    private String data;
    char reply;
    
    public void enter(){
        
        Entry ent = new Entry();
        
        do{
            System.out.print("Enter the ID of article: ");
            id_article = enter.nextInt();
            System.out.print("You want to enter another article? (y/n): ");
            reply = enter.next().charAt(0);
            System.out.println("");
            
        }while(reply == 'y' || reply == 'Y');
        
        entry.add(ent);
        
    } 
    public static void modify(){
        
    }
    public static void delete(){
        
    }
    public static void see(){
        
    }
}
