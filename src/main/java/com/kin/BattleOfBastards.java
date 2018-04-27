package com.kin;

import dagger.Component;

@Component(modules = BraavosModule.class)
interface BattleComponent {
    War getWar();
    Starks getStarks();
    Boltons getBoltons();
    Cash getCash();
    Soldiers getSoldiers();
}

public class BattleOfBastards {

    public static void main (String [] args) {
        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        BattleComponent component = DaggerBattleComponent
                .builder()
                .braavosModule(new BraavosModule(cash, soldiers))
                .build();
        War war = component.getWar();
        war.prepare();
        war.report();

        war = component.getWar();
    }
}
