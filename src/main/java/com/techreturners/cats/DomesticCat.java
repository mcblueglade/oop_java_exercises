package com.techreturners.cats;

// DomesticCat extends abstract class Cat
class DomesticCat extends Cat {

    public DomesticCat() {
        super(23, "domestic");
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

    @Override
    public String wakeUp() {
        super.setToWakeUp();
        return "Cat should be awake now";
    }

    @Override
    public boolean isAsleep() {
        return super.isAsleep();
    }
}