package info.company.Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayeg {

//    int hands=2;
////
//    public void hands(){
//
//    }

    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6,7,8,9,10};

        Scanner s= new Scanner(System.in);

        int size =s.nextInt();
        boolean[] ar1 = new boolean[size];

//        ar.length=40;
        for (int i = 0; i <ar1.length; i++) {

            ar1[i]=s.nextBoolean();
        }

        for (int i = 0; i <ar1.length ; i++) {
            System.out.println(ar1[i]);
        }

        for (int i = 0; i <ar1.length ; i++) {

            System.out.println(ar[i]);
        }

        System.out.println(ar);


        System.out.println(Arrays.toString(ar));
    }
}
