package com.hydrargum.prototype;

public class ElfMage extends Mage {

    private String help;

    public ElfMage(String help) {
        this.help = help;
    }

    public ElfMage(ElfMage elfMage) {
        this.help = elfMage.help;
    }

    @Override
    public Object copy() throws CloneNotSupportedException {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "Elf mage help in " + this.help;
    }

}