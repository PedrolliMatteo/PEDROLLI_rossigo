package org.example.modelli;

public class Utente
{
    public int id;
    public String nome;
    public String codFiscale;
    public double credito;

    public Utente(int id, String nome, String codFiscale, double credito)
    {
        this.id = id;
        this.nome = nome;
        this.codFiscale = codFiscale;
        this.credito = credito;
    }
}
