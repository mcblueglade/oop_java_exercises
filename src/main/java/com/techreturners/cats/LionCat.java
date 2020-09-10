package com.techreturners.cats;

class LionCat extends Cat {

    public LionCat() {
        this.type = "wild";
        this.averageHeight = 1100;
    }

    public String eat() {
        return "Roar!!!!";
    }

    @Override
    public Boolean isASleep() {
        return super.isAsleep();
    }

    @Override
    public String wakeUp() {
        return null;
    }
}