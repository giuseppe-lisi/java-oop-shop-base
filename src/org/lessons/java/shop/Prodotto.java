package org.lessons.java.shop;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva;

    public Prodotto(int codice, String nome, String descrizione, float prezzo, float iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
}
