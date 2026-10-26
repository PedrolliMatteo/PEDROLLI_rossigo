package org.example.eccezioni;

public class BatteriaScaricaException extends RossiGoException
{
    public BatteriaScaricaException(String message, double batteria)
    {
        super(message + "\nBatteria attuale " + batteria + "% sotto il 15%");
    }
}
