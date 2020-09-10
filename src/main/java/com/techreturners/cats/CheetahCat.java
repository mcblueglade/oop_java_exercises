package com.techreturners.cats;

class CheetahCat extends Cat {

    public CheetahCat() {
        this.type = "wild";
        // TODO this.averageHeight = 0;
    }

    public String eat() {
        return "Zzzzzzz";
    }

    @Override
    public Boolean isASleep() {
        // TODO Auto-generated method stub
        return super.isAsleep();
    }

    @Override
    public String wakeUp() {
        return null;
    }
}