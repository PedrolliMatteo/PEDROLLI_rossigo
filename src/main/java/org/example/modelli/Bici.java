package org.example.modelli;

public class Bici extends Veicolo
{
    private int nMarce;
    // tariffa = 0.15€/min

    public Bici()
    {
        super();
        nMarce = 5; // max 7
    }

    public Bici(String codice, int percBatteria, String stato, int nMarce)
    {
        super(codice, percBatteria, stato);
        this.nMarce = nMarce;
    }

    @Override
    public double calcolaCosto(int minuti)
    {
        double tariffa = 0.15;
        tariffa *= minuti;
        return tariffa;
    }

    @Override
    public double consumoBatteriaPerMinuto()
    {
        // dura 100% per 200 minuti
        return 0.5;
    }

    public int getNumeroMarce()
    {
        return this.nMarce;
    }
}
