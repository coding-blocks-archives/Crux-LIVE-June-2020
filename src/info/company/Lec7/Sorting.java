package info.company.Lec7;

import info.company.Lec6.ArratQues;

public class Sorting {

    public static void main(String[] args) {

        int[] ar= {1,2,3,4,5};

//        bubblesort(ar);
//
//        System.out.println(Arrays.toString(ar));
//        selectionsort(ar);
//        insertionsort(ar);
//        System.out.println(Arrays.toString(ar));


    }

    public static void bubblesort(int[] ar){

        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar.length-i-1 ; j++) {

                if(ar[j]>ar[j+1]){
                    ArratQues.swap(j,j+1,ar);
                }
            }
        }
    }

    public static void selectionsort(int[] ar){

        for (int i = 0; i <ar.length ; i++) {

          int maxindex = ArratQues.maxIndex(0,ar.length-i-1, ar);
          ArratQues.swap(maxindex,ar.length-i-1,ar);
        }
    }

    public static void insertionsort(int[] ar){

        for (int i = 0; i <ar.length-1 ; i++) {

            for (int j = i+1 ; j>0 ; j--) {

                if(ar[j]<ar[j-1]){

                    ArratQues.swap(j,j-1,ar);
                }

                else{
                    break;
                }
            }
        }
    }


}
