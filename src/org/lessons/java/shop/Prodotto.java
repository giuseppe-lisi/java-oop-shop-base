package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private float iva;

    public Prodotto(String nome, String descrizione, float prezzo, float iva) {
        // genera un codice random compreso tra 10 e 50 inclusive
        Random rand = new Random();
        this.codice = rand.nextInt(1001);;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public float getBasePrice() {
        return this.prezzo;
    }

    public float getTaxedPrice() {
        float productIva = this.prezzo * (this.iva / 100);
        float taxedPrice = this.prezzo + productIva;
        return taxedPrice;
    }

    public String getProductName() {
        return this.codice + "-" + this.nome;
    }
}
