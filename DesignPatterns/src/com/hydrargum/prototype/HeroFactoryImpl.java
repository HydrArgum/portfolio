package com.hydrargum.prototype;

public class HeroFactoryImpl implements HeroFactory {

    private Mage mage;
    private Warlord warlord;

    public HeroFactoryImpl(Mage mage, Warlord warlord) {
        this.mage = mage;
        this.warlord = warlord;
    }

    public Mage createMage() {
        try {
            return (Mage) mage.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Warlord createWarlord() {
        try {
            return (Warlord) warlord.copy();

        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Beast createBeast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
