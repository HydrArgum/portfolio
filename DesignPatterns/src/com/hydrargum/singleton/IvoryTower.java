package com.hydrargum.singleton;

class IvoryTower {

    private IvoryTower() { //priv cnstr
    }

    public static final IvoryTower INSTANCE = new IvoryTower();
    
    public static IvoryTower getInstance() {
        return INSTANCE;

    }

}
