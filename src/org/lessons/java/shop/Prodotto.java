package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva;

    public Prodotto(String nome, String descrizione, float prezzo, float iva) {
        // genera un codice random compreso tra 10 e 50 inclusive
        Random rand = new Random();
        int codice = rand.nextInt(10,51);
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    float getBasePrice() {
        return this.prezzo;
    }

    float getTaxedPrice() {
        float productIva = this.prezzo * (this.iva / 100);
        float taxedPrice = this.prezzo + productIva;
        return taxedPrice;
    }

    String getProductName() {
        return this.codice + "-" + this.nome;
    }
}
