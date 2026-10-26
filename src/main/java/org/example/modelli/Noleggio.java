package org.example.modelli;

public class Noleggio
{
    public Utente utente;
    public Veicolo veicolo;
    public int oraInizio; // versione militare -> 1200 = 12:00
    public int oraFine;

    public Noleggio(Utente utente, Veicolo veicolo, int oraInizio, int oraFine)
    {
        this.utente = utente;
        this.veicolo = veicolo;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
    }
}
