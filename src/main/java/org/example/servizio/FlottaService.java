package org.example.servizio;
import it.kamaladafrica.codicefiscale.CodiceFiscale;
import org.example.modelli.Utente;
import org.example.modelli.Veicolo;
import org.example.eccezioni.CodiceFiscaleNonValidoException;
import org.example.eccezioni.RossiGoException;

import java.util.ArrayList;

public class FlottaService
{
    //gestisce veicoli, utenti e noleggi attivi

    public ArrayList<Veicolo> veicoli;
    public ArrayList<Utente> utenti;

    public FlottaService()
    {
        veicoli = new ArrayList<>();
        utenti = new ArrayList<>();
    }

    public Veicolo registraVeicolo(Veicolo v)
    {
        return v;
    }

    public Utente registraUtente(Utente u)
    {
        return u;
    }
}
