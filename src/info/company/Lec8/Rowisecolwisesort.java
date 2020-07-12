package info.company.Lec8;

public class Rowisecolwisesort {

    public static void main(String[] args) {

        int[][] ar={{1,2,3},
                {4,5,6},
                {7,8,9}};

        System.out.println(Search(ar,6));
    }

    public static String Search(int[][] ar, int ele){

        int i=0;
        int j=ar.length-1;

        while(i<ar.length && j>=0){

            if(ar[i][j]==ele){
                return i+" "+j;
            }

            else if(ar[i][j]<ele){
                i++;
            }
            else{
                j--;
            }
        }
        return "Nhi mila";
    }
}
