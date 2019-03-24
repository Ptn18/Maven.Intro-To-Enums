package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    public String getCatchPhrase() {
        String phrase = "Hey, my name is ";
        if(this == ALICE){
            return phrase + ALICE + "!";
        }else
        return phrase + BOB + "!";
    }


    public boolean isAlice() {
        if(this == ALICE){
            return true;
        }
        return false;
    }

    public boolean isBob(){
        if(this == BOB){
            return true;
        }
        return false;
    }

}
