package com.github.dorval.francois.business;

public class Divisifieur {

    /**
     * fait la division
     * @param dividende
     * @param diviseur
     * @return
     */
    public static int diviser(int dividende, int diviseur)
    {
        if (diviseur == 0){
            throw new IllegalArgumentException(Errors.PAS_DE_DIV_PAR_0);
        }

        return dividende/diviseur;
    }
}


