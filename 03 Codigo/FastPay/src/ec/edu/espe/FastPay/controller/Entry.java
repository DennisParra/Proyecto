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
    private int id_article;
    private String data;
    //private Bill : bill;
    private float price;
    private final int option;
    Scanner enter = new Scanner(System.in);
//    Scanner read = new Scanner(System.in);
//    {
//    System.out.println("****Menu de opciones****");   
//    System.out.println("1.-Enter");
//    System.out.println("2.-Modify");
//    System.out.println("3.-Delete");
//    System.out.println("4.-See");
//    
//    option = read.nextInt();
//    switch(option)
//    {
//        case 1:
//            System.out.println("Enter the dates for the article: ");
//            this.id_article = Integer.parseInt(read.nextLine());
//            
//            
//    }
//    
//    }
//    
    
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID of article: ");
        this.id_article = Integer.parseInt(enter.nextLine());
        
    } 
    public static void modify(){
        
    }
    public static void delete(){
        
    }
    public static void see(){
        
    }
}
