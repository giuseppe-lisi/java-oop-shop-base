package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto banana = new Prodotto("banana", "è un frutto giallo simile ad una zucchina", 20f, 10);


        System.out.println("Costo base: " + banana.getBasePrice());
        System.out.println("Costo comprensivo di iva: " + banana.getTaxedPrice());
        System.out.println("Codice e nome prodotto" + banana.getProductName());
    }
}
