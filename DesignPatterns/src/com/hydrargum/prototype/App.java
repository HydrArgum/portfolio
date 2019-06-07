package com.hydrargum.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("App fut");

        HeroFactoryImpl factory;
        Mage mage;
        Warlord warlord;

        factory = new HeroFactoryImpl(new ElfMage("Cooking"), new ElfWarlord("Cleaning"));
        mage = factory.createMage();
        LOGGER.info(mage.toString());
        warlord = factory.createWarlord();
        LOGGER.info(warlord.toString());
    }
}
