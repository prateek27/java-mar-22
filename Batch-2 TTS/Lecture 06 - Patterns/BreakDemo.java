package com.prateek.javaMarchB2.patterns;

public class BreakDemo {
    public static void main(String[] args) {

        int cal_goal = 50;
        int gf_calls_up = 10;
        int cal;

        for(cal=0; cal<cal_goal; cal=cal+1){
            System.out.println("Running ...." + cal);
            if(cal==gf_calls_up){
                break; //stopping the loop early based upon certain condition
            }
        }

        if(cal < cal_goal){
            System.out.println("Going for dinner date");
        }
        else {
            System.out.println("Workout complete " + cal);
        }

    }
}
