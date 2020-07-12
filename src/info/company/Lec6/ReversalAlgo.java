package info.company.Lec6;

import java.util.Arrays;

public class ReversalAlgo {

    public static void main(String[] args) {

        int ar[] = {11,2,31,4,5};
        int k=2;

        ArratQues.reverse(ar,0, k-1);
        System.out.println(Arrays.toString(ar));

        ArratQues.reverse(ar,k, ar.length-1);
        System.out.println(Arrays.toString(ar));

        ArratQues.reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
}
