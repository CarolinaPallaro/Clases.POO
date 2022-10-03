package com.company;

public class Fecha2 {
    private int day;
    private int month;
    private int year;

    public Fecha2(int d, int m, int y)  throws FechaException {
        if (d < 1 || d > 31 || m < 1 || m > 12)
            throw new FechaException("Los valores no son válidos");
        day = d;
        month = m;
        year = y;
    }
}


//equalsIgnoreCase(String anotherString)