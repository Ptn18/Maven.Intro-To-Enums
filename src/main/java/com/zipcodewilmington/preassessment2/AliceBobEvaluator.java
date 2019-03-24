package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    private String input;

    public AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice() {
            if(input == "Alice"){
                return true;
            }
            return false;
        }
        public boolean isBob(){
            if(input == "Bob"){
                return true;
            }
            return false;
        }



}
