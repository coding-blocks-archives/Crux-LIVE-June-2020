package info.company.Lec5;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int a=4;
        int b=5;
//        int ar[] = new int[5];

        int ar[]= {1,2,3};


        System.out.println(a +" "+ b);


        System.out.println(Arrays.toString(ar));

        swap(ar);

        System.out.println(Arrays.toString(ar));

//        System.out.println(a +" "+ b);

    }

    public static void swap(int[] br) {

        br[0]=11;
    }
}
