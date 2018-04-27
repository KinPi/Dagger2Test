package com.kin;

import javax.inject.Inject;

public class Boltons implements House {

    @Inject
    public Boltons () {
        System.out.println("Testing");
    }

    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName() + " prepared for war.");
    }

    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName() + " reported for war.");
    }
}
