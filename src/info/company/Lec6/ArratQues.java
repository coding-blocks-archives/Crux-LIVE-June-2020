package info.company.Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class ArratQues {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] ar =new int[n];

        for (int i = 0; i <ar.length ; i++) {
            ar[i] =s.nextInt();
        }

//        maxValue(ar);
//
//        System.out.println(maxValueUpg(ar));


        System.out.println(Arrays.toString(ar));


    }

    public static void maxValue(int[] ar) {
// bad time complexity
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[ar.length - 1]);

    }

    public static int maxValueUpg(int ar[]){

        int max = ar[0];

        for (int i = 1; i <ar.length ; i++) {

            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }

    public static int maxIndex(int start,int end, int ar[]){

        int max = start;

        for (int i = start; i <= end ; i++) {

            if(ar[i]>ar[max]){
                max=i;
            }
        }
        return max;
    }

    public static void swap(int start, int end ,int[] ar){

        int temp= ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }


    public static void reverse(int[] ar, int start, int end){

        while(start < end){

            swap(start,end,ar);

            start= start + 1;
            end = end - 1;
        }
    }

}
