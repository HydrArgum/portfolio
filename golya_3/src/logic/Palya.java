package logic;

import java.util.ArrayList;

public class Palya {

    private final Allat[][] cellak; // egy cellában egy állat állhat.
    private final Cella[][] cellak_v2; //egy cellában több állat is állhat.

    private final int szelesseg;
    private final int magassag;

    public int getSzelesseg() {
        return szelesseg;
    }

    public int getMagassag() {
        return magassag;
    }

    public Palya(int magassag, int szelesseg) {
        this.szelesseg = szelesseg;
        this.magassag = magassag;
        cellak = new Allat[magassag][szelesseg];
        cellak_v2 = new Cella[magassag][szelesseg];

    }

    public void abrazolas() {
        for (Allat[] sorok : cellak) {
            for (Allat allat : sorok) {
                if (allat instanceof Object) {
                    System.out.print(allat.faj);
                } else { // ha Object (azaz nem Allat), akkor null. A null nem Object.
                    System.out.print(".");
                }
            }
            System.out.println(""); //soremelés
        }
    }

    public void abrazolas_v2() {
        for (Cella[] sor : cellak_v2) {
            for (Cella cella : sor) {
                for (Allat cellalako : cella.getCellalakok()) {
                    if (cellalako instanceof Object) {
                        System.out.println("!");
                        
                    } else {
                        System.out.println(".");
                    }
                }
            }
        }
    }

    public void setCella(int sor, int oszlop, Allat allat) {
        cellak[sor][oszlop] = allat;

    }

    public void setCella_v2(int sor, int oszlop, Allat allat) {
        cellak_v2[sor][oszlop].setCellalako(allat);

    }

    public void newRound() {
//Az új kör feladatai:
//Menjen végig a cellákon, és ha állatot talál, akkor mozgassa.
//Az állatban tehát kell egy mozgatós metódus
//A mozgást az állat végzi. Ehhez tudni kell, hogy hol van?
//Vagy nem?
//A cellákban megy végig a ciklus. Ha állatot talál, mit csinál vele?
//A ciklus tudja, hogy hol van. Az állat nem. De a ciklus, amikor meghívja az állat mozgat() metódusát, akkor átadhatja neki paraméterben az aktuális helyzetet.
//a jövőbeni bővítésben nem alakítjuk ki annak lehetőségét, hogy a pály egy cellájában több állat is lehessen?
//ehhez csak annyi kell, hogy a cella nem Allat() elemeket tartalmaz, hanem ArrayListeket, melye Allat() elemeket tartalmaznak.
//Ha a palyanak a cellak tagját átírjuk úgy, hogy a setCella(y, x, Allat()) metódus az Allat()-ot nem simán összekapcsolja a cella[y][x]-szel, hanem 
//cella[y][x].add(Allat()) lesz cellak[y][x]=Allat(); helyett, akkor cellák végigmászkálás ciklusom 3 mély for lesz.
//A belső lesz az ArrayList, erre lehet rakni fore ciklust, minden elemére meghívható a mozgat.

    }

}
