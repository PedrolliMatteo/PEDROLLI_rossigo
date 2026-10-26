package org.example.modelli;

public abstract class Veicolo
{
    protected String codice;
    protected int percBatteria;
    protected String stato;

    public Veicolo()
    {
        codice = "";
        percBatteria = 100;
        stato = "LIBERO";
    }

    public Veicolo(String codice, int percBatteria, String stato)
    {
        this.codice = codice.toUpperCase();
        this.percBatteria = percBatteria;
        this.stato = stato.toUpperCase();
    }

    public abstract double calcolaCosto(int minuti);
    // in % al minuto
    public abstract double consumoBatteriaPerMinuto();
}
