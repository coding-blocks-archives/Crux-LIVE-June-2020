package info.company.Lec11;

import info.company.Lec6.ArratQues;

import java.util.Arrays;

public class RecursionArray {

    public static void main(String[] args) {

//        int[] ar= {1,2,3,4};
//        System.out.println(sortedornot(ar,0));
        int[] ar = {4,3,2,1};

        bubblesort(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }

    public static boolean sortedornot(int[] ar, int index){

        if(index==ar.length-1){
            return true;
        }

        if(ar[index]>ar[index+1]){
            return false;
        }

        return sortedornot(ar,index+1);
    }

    public static int findelement(int[] ar, int index, int ele){

        if(index == ar.length){
            return -1;
        }

        if(ar[index]== ele){
            return index;
        }

        return findelement(ar, index+1, ele);
    }

    public static int sum(int n){

        if(n==1){
            return 1;       //Nth triangle
        }

        return n + sum(n-1);
    }

    public static void pattern(int row, int col){

        if(row==0){
            return;
        }

        if(col==row){
            pattern(row-1,0);
//            System.out.println();
            return;
        }

        pattern(row,col+1);
//        System.out.print("*");
    }

    public static void bubblesort(int[] ar, int i, int j){

        if(i==0){
            return;
        }

        if(j==i){
            bubblesort(ar,i-1,0);
            return;
        }

        if(ar[j]>ar[j+1]){
            ArratQues.swap(j, j+1, ar);
        }

        bubblesort(ar,i,j+1);
    }



}
