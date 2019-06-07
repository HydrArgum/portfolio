package logic;

public class StaticMyClass {

    private StaticMyClass() {
    }

    public static void kezelo() {
        System.out.println("Ez egy Statikus metódus, példány nélküli osztályból lett meghívva");
        final int y; // Nem értelmezhető a static jelölés egy metódus-változóra.

    }

    final static int X = 0; //A static jelölés értelmezhető egy osztály-változóra.

}
