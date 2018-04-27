package com.kin;

import javax.inject.Inject;

public class Starks implements House {

    private Allies allies;

    @Inject
    public Starks (Allies allies) {
        this.allies = allies;
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
