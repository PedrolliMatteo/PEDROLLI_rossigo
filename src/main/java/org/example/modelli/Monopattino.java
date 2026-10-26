package org.example.modelli;

public class Monopattino extends Veicolo
{
    private int vMax;
    // tariffa = 0.25€/min

    public Monopattino()
    {
        super();
        vMax = 7;
    }

    public Monopattino(String codice, int percBatteria, String stato, int vMax)
    {
        super(codice, percBatteria, stato);
        this.vMax = vMax;
    }

    @Override
    public double calcolaCosto(int minuti)
    {
        double tariffa = 0.25;
        tariffa *= minuti;
        return tariffa;
    }

    @Override
    public double consumoBatteriaPerMinuto()
    {
        // dura 100% per 50 minuti
        return 2.0;
    }
}
