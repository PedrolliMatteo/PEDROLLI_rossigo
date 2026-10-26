package org.example.eccezioni;

public class CreditoInsufficienteException extends RossiGoException
{
    public CreditoInsufficienteException(String message, int credito)
    {
        super(message + "\nCredito di " + credito + "€ sotto soglia di blocco (credito < 1€)");
    }
}
