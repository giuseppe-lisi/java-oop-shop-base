package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // 3 possibili metodi costruttori
    public Prodotto(String nome) {
        // genera un codice random compreso tra 10 e 50 inclusive
        Random rand = new Random();
        this.codice = rand.nextInt(1001);;
        this.nome = nome;
    }

    public Prodotto(String nome, String descrizione) {
        // genera un codice random compreso tra 10 e 50 inclusive
        Random rand = new Random();
        this.codice = rand.nextInt(1001);;
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        // genera un codice random compreso tra 10 e 50 inclusive
        Random rand = new Random();
        this.codice = rand.nextInt(1001);;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public BigDecimal getBasePrice() {
        return this.prezzo;
    }
    
    public BigDecimal getTaxedPrice() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }
    
    public String getProductName() {
        return this.codice + "-" + this.nome;
    }
    
    // metodi mutators e accessor
    public int getCodice() {
        return this.codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
}
