package ec.edu.espe.FastPay.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Article {
<<<<<<< HEAD
    private static String idArticle;
    private static String name;
    public Article (String idArticle, String name)
        {
            this.idArticle = idArticle;
            this.name = name;
        }
    public Article(){}
    public String getIdArticle()
    {
        return idArticle;
    }
    public String getName()
    {
        return name;
    }
    
}
=======
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
            System.out.println("Enter article ID: ");
            id_article = enter.nextInt();
            System.out.println("Type the name: ");
            name = enter.next();
            System.out.println("Enter the provider ID: ");
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
            show.println("Stock: " + stock);

                show.println("");
            }
            show.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
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
            show.println("Stock: " + stock);


               
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
>>>>>>> b7a303204113e6be467943598c489c7eb83c12b8
