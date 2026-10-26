package org.example.eccezioni;

public class UtenteNonTrovatoException extends RossiGoException
{
    public UtenteNonTrovatoException(String message, int id)
    {
        super(message + "\nId utente " + id + " non esite");
    }
}
