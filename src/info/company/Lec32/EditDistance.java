package info.company.Lec32;

import java.util.Arrays;

public class EditDistance {

    public static void main(String[] args) {

//        System.out.println(EditDistanceRec("dogs","dog"));
        String s1 = "dog";
        String s2 = "dogs";
        int[][] mem = new int[s1.length()+1][s2.length()+1];

        System.out.println(EditDistanceItr(s1,s2,mem));
        for (int i = 0; i <mem.length ; i++) {

            System.out.println(Arrays.toString(mem[i]));
        }
//        System.out.println(EditDistanceRec(s1,s2));
//        System.out.println(EditDistanceTD(s1,s2,mem));
    }
    public static int EditDistanceRec(String s1, String s2){

        if(s1.length()==0){
            return s2.length();
        }

        if(s2.length()==0){
            return s1.length();
        }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if(f==s){
            return EditDistanceRec(s1.substring(1), s2.substring(1));
        }
        else{
            return 1+ Math.min(EditDistanceRec(s1.substring(1),s2),
                    Math.min(EditDistanceRec(s1,s2.substring(1)),
                            EditDistanceRec(s1.substring(1),s2.substring(1))));
        }
    }

    public static int EditDistanceTD(String s1, String s2, int[][] mem){

        if(s1.length()==0){
            return s2.length();
        }

        if(s2.length()==0){
            return s1.length();
        }

        if(mem[s1.length()][s2.length()]!=0){
            return mem[s1.length()][s2.length()];
        }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if(f==s){
            mem[s1.length()][s2.length()]= EditDistanceTD(s1.substring(1), s2.substring(1),mem);
        }

        else{
           mem[s1.length()][s2.length()] =1+ Math.min(EditDistanceTD(s1.substring(1),s2,mem),
                    Math.min(EditDistanceTD(s1,s2.substring(1),mem),
                            EditDistanceTD(s1.substring(1),s2.substring(1),mem)));
        }

        return mem[s1.length()][s2.length()];
    }


    public static int EditDistanceItr(String s1, String s2, int[][] mem){


        for (int i = 0; i <=s1.length() ; i++) {

            for (int j = 0; j <= s2.length() ; j++) {

                if(i==0){

                    mem[i][j]=j;
                }

                else if(j==0){

                    mem[i][j] = i;
                }


                else{

                    if(s1.charAt(i-1)==s2.charAt(j-1)){

                        mem[i][j]=  mem[i-1][j-1];
                    }

                    else{

                        mem[i][j]= 1+ Math.min(mem[i-1][j], Math.min(mem[i-1][j-1],mem[i][j-1]));
                    }
                }
            }
        }

        return mem[s1.length()][s2.length()];
    }


}
