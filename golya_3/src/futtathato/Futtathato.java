package futtathato;

import logic.Golya;
import logic.*;

public class Futtathato {

    public static void main(String[] args) {

        StaticMyClass.kezelo();
        
        final int SZELESSEG = 11;
        final int MAGASSAG = 5;
        final int MAX_Y = MAGASSAG - 1;
        final int MAX_X = SZELESSEG - 1;

        Palya palya = new Palya(MAGASSAG, SZELESSEG);

        palya.setCella(0, 0, new Golya());
        palya.setCella(MAX_Y, MAX_X, new Beka());
        palya.setCella(MAX_Y / 2, MAX_X / 2, new Legy());
//        palya.newRound();
        palya.abrazolas();

        
        
        
        
        
        
        
    }
}
