/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Article {
    private int id_article;
    private String name;
    private int id_provider;
    private int stock;
    public static void insert(){
        
    Scanner enter= new Scanner(System.in);
    
    File Article = new File ("Article.csv");
    
    int id_article, id_provider, stock;
    String name;
        
    if(!Article.exists()){
        try {
            Article.createNewFile();
            System.out.println("Enter the id the article: ");
            id_article = enter.nextInt();
            System.out.println("Type the name: ");
            name = enter.next();
            System.out.println("Enter the Id the provider: ");
            id_provider = enter.nextInt();
            System.out.println("Enter the Stock: ");
            stock = enter.nextInt();
            System.out.println(" ");               
            PrintWriter show;
            try (FileWriter escribir = new FileWriter(Article, true)) {
            show = new PrintWriter(escribir);
            show.println("ID the Article: " + id_article );
            show.println("Name: " + name );
            show.println("ID provider: " + id_provider );
            show.println("Stock: " + show);

                show.println("");
            }
            show.close();
        } catch (IOException ex) {
        }
               
    }
    
    
    

        
    }
    public static void modify(){
        
    }
    public static void consult(){
        
    }
    public static void delete(){
        
    }
}
