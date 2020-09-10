package com.techreturners.cats;

public abstract class Cat implements CatBehaviour {

    protected Boolean isCatAsleep = false;
    protected int averageHeight = 0;
    protected String type;

    public Cat() {
        // this.isCatAsleep = false;
        // this.averageHeight = 0;
    }

    public Boolean isAsleep() {
        return this.isCatAsleep;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public String getSetting() {
        return this.type;
    }

    public String goToSleep() {
        isCatAsleep = true;
        return "Cat should be snoozing";
    }

}
