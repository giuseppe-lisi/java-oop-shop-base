package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto banana = new Prodotto(1, "banana", "è un frutto giallo simile ad una zucchina", 10.5f, 10);

        System.out.println(banana.descrizione);
    }
}
