package info.company.Lec8;

public class Waveprint {

    public static void main(String[] args) {

//        int[] ar1= {1,2,3};

        int[][] ar={{1,2,3},
                    {4,5,6},
                    {7,8,9}};

        waveprint(ar);
    }

    public static void waveprint(int[][] ar){

        for (int i = 0; i <ar.length ; i++) {

            if(i%2==0){
                for (int j = 0; j <ar[i].length ; j++) {
                    System.out.println(ar[i][j]);
                }
            }

            else{
                for (int j = ar[i].length-1; j >=0 ; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }

}
