package com.hydrargum.prototype;

public class ElfWarlord extends Warlord {

    private String help;

    public ElfWarlord(String help) {
        this.help = help;
    }

    public ElfWarlord(ElfWarlord elfWarlord) {
        this.help = elfWarlord.help;
    }

    @Override
    public Object copy() throws CloneNotSupportedException {
        return new ElfWarlord(this);
    }

    @Override
    public String toString() {
        return "Elf warlord help in " + this.help;
    }

}
