package org.example.eccezioni;

public class CodiceFiscaleNonValidoException extends RossiGoException
{
    public CodiceFiscaleNonValidoException(String message, String codFiscale)
    {
        super(message + "\nCodice fiscale " + codFiscale + " non è valido");
    }
}
