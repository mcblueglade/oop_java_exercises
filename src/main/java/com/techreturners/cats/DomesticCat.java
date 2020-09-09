package com.techreturners.cats;

class DomesticCat extends Cat {

    Boolean catIsAsleep = false;
    public Boolean isAsleep() {
        return catIsAsleep;
    
    } 
    public String getSetting() {
        return "domestic";
    
    }  
    public int getAverageHeight() {
        return 23;
    
    }  
    
    public String eat() {
         return "Purrrrrrr";
    
    } 
    public String goToSleep()  {
       
        catIsAsleep = true;
        return "Cat should be snoozing";

    }
    public String wakeUp()  {
        
        catIsAsleep = false;
        return "Cat should be awake now";

    }
}