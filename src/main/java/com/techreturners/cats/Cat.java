package com.techreturners.cats;

public abstract class Cat implements CatBehaviour {

    protected boolean isCatAsleep = false;
    private int averageHeight = 0;
    private String setting;

    public Cat(int averageHeight, String setting) {
        this.averageHeight = averageHeight;
        this.setting = setting;
    }

    public boolean isAsleep() {
        return this.isCatAsleep;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public String getSetting() {
        return this.setting;
    }

    public String goToSleep() {
        isCatAsleep = true;
        return "Cat should be snoozing";
    }

    public void setToWakeUp() {
        this.isCatAsleep = false;
    }

}
