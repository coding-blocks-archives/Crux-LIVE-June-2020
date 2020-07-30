package info.company.Lec28;

import java.util.Scanner;

public class Bitmaskeg {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//
//        int a= s.nextInt();
//        int b= s.nextInt();
//        int[] ar = {3,3,5,7,7,1,1};
//        long a = -2;
//        System.out.println(a<<1);
//        oddeven(n);
//        System.out.println(unique(ar));
//        xorswap(a,b);

        int a =0;
        int b = 7;
        System.out.println(bitchangereq(a,b));

    }


    public static void oddeven(int n){

        if((n&1)==1){

            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

    }

    public static void xorswap(int a, int b){

        a= a^b;
        b=a^b;
        a=a^b;

        System.out.println(a + " " +b);
    }


    public static int unique(int[] ar){

        int res =0;

        for (int i = 0; i <ar.length ; i++) {

            res=res^ar[i];
        }
        return res;
    }

    public static int bitchangereq(int from , int to){

        int res = (from ^ to) ;

        return setbitcount(res);
    }

    public static int setbitcount(int n){

        int cnt =0;

        while(n!=0){

            if((n&1)==1){
                cnt++;
            }
            n= n>>1;
        }

        return cnt;
    }
}
