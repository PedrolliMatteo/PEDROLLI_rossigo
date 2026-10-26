package org.example.eccezioni;

public class VeicoloNonDisponibileException extends RossiGoException
{
    public VeicoloNonDisponibileException(String message, String codice)
    {
        super(message + "\nVeicolo " + codice + " già in uso/in carica");
    }
}
