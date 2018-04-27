package com.kin;

import dagger.Module;
import dagger.Provides;

@Module
public class BraavosModule {
    Cash cash;
    Soldiers soldiers;

    public BraavosModule (Cash cash, Soldiers soldiers) {
        this.cash = cash;
        this.soldiers = soldiers;
    }

    @Provides
    Cash providesCash () {
        return cash;
    }

    @Provides
    Soldiers providesSoldiers () {
        return soldiers;
    }

}
