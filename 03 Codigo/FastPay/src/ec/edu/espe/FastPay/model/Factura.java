package ec.edu.espe.FastPay.model;

import ec.edu.espe.FastPay.controller.Article;



public class Factura extends Article {
    private static int numeroFactura;
    private static String fecha;
    private static int cantidad;
    private static Double precio;

    public Factura(String idArticle, String name) {
        super(idArticle, name);
    }

    public Factura() {
    }

    
  
}