package info.company.Lec12;

import java.util.Collections;

public class StringQues {

    public static void main(String[] args) {

        String str="Hello";

//        removei("","hih");

//        dicecount("",4);


    }

    public static void removei(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed= unprocessed.substring(1);

        if(ch=='i'){
            removei(processed,unprocessed);
        }

        else{
            removei(processed+ch, unprocessed);
        }

    }

    public static void dicecount(String processed, int target){

        if(target==0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <=6 && i<=target ; i++) {

            dicecount(processed+i,target-i);
        }

    }

    public static int dicecounting(int target){

        if(target==0){
            return 1;
        }

        int cnt = 0;
        for (int i = 1; i <=6 && i<=target ; i++) {

            cnt+= dicecounting(target-i);

        }

        return cnt;
    }

}
