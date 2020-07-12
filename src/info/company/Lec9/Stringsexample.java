package info.company.Lec9;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsexample {

    public static void main(String[] args) {

        Scanner scn =new Scanner(System.in);
//        String s = new String("    Hello    ") ;
        String str ="aella" ;

        System.out.println(str.codePointAt(0));
//        int str2 =scn.nextInt();
//        String str1 = scn.next();
//        System.out.println(s.equals(str));
//
//        System.out.println(s.charAt(0));

//        System.out.println(Arrays.toString(s.toCharArray()));

//        System.out.println(s.length());

//        System.out.println(s.concat(str));

//        System.out.println(s.strip());

//        System.out.println();

//        System.out.println(str1);
//        System.out.println(str2);

//        s=s+"boy";
//        System.out.println(s);

        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.indexOf("t"));

        System.out.println(str.indexOf("",0));
        System.out.println();

        locations("aellla");

//        System.out.println(str.replace());
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,3));
    }

    public static void locations(String str){

        int index = 0;

        while(true){

            index= str.indexOf('a',index);

            if(index==-1){
                break;
            }
            System.out.println(index);
            index = index+1;
        }
    }
}
