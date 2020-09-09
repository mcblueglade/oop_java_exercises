package com.techreturners.cats;

class DomesticCat extends Cat {

    public String getSetting() {
        return "domestic";

    }

    public int getAverageHeight() {
        return 23;

    }

    public String eat() {
        return "Purrrrrrr";

    }

    public String goToSleep() {

        isCatAsleep = true;
        return "Cat should be snoozing";

    }

    public String wakeUp() {

        isCatAsleep = false;
        return "Cat should be awake now";

    }
}