package com.techreturners.cats;

public abstract class Cat {

    Boolean isCatAsleep = false;

    public Boolean isAsleep() {
        return isCatAsleep;
    }

    @Override
    public abstract String getSetting();

    @Override
    public abstract int getAverageHeight();

    @Override
    public abstract String eat();

    @Override
    public abstract String goToSleep();

    @Override
    public abstract String wakeUp();
}
