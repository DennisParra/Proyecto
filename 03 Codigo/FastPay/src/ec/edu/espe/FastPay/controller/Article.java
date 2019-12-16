package ec.edu.espe.FastPay.controller;

public class Article {
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