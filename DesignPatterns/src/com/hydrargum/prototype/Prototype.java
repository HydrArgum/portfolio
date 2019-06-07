package com.hydrargum.prototype;

abstract class Prototype implements Cloneable{

    public abstract Object copy() throws CloneNotSupportedException;

}

