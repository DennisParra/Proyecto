/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.controller;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Entry {
    
    Scanner enter = new Scanner (System.in);
    
    private int id_article;
    private String data;
    
    
    
    public void enter(){
        
        System.out.println("Enter the ID of article: ");
        id_article = enter.nextInt();
        
    } 
    public static void modify(){
        
    }
    public static void delete(){
        
    }
    public static void see(){
        
    }
}
