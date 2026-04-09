package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto banana = new Prodotto("banana", "è un frutto giallo simile ad una zucchina", new BigDecimal(10), new BigDecimal(0.22));

        System.out.println("Costo base: " + banana.getBasePrice());
        System.out.println("Costo comprensivo di iva: " + banana.getTaxedPrice());
        System.out.println("Codice e nome prodotto: " + banana.getProductName());
        banana.setNome("zucchina");
        System.out.println(banana.getNome());
    }
}
