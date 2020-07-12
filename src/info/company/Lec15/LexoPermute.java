package info.company.Lec15;

import java.util.Arrays;

public class LexoPermute {

    public static void main(String[] args) {
        String str = "cb";
       int[] fre = new int[26];
        int diff= str.compareTo("aabc");
        System.out.println(diff);

       frequency(fre,str);
       lexoperm("",fre,str.length(),str);

//        for (int i = 0; i <fre.length ; i++) {
//
//            if(fre[i]>0){
//                System.out.println((char)(i+'a'));
//            }
//        }
    }

    public static void lexoperm(String processed, int[] fre, int length, String str){
        if (length == 0) {

            if(processed.compareTo("aabc")>0)
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <fre.length ; i++) {

            if(fre[i]>0){
                fre[i]--;
                lexoperm(processed+(char)(i+'a'),fre,length-1,str);
                fre[i]++;
            }
        }
    }

    public static void frequency(int[] fre, String str){

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);
            fre[ch-'a']++;
        }
    }
}
