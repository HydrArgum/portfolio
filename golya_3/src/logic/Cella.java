package logic;

import java.util.ArrayList;

class Cella {

    private ArrayList<Allat> cellalakok;

    public ArrayList<Allat> getCellalakok() {
        return cellalakok;
    }

    public void setCellalako(Allat cellalako) {
        this.cellalakok.add(cellalako);
    }

}
