package info.company.Lec32;

public class MazePath {

    public static void main(String[] args) {

        System.out.println(mazepath(5,5));

        int row =5;
        int col =5;
//        Integer[][] mem = new Integer[row+1][col+1];
          int[][] mem = new int[row+1][col+1];

        System.out.println(mazeItrDp(row,col,mem));
//        System.out.println(mazepathRecDp(row,col,mem));
    }

    public static int mazepath(int row, int col){

        if(row==1 || col==1){
            return 1;
        }

        return mazepath(row-1,col) + mazepath(row,col-1);
    }

    public static int mazepathRecDp(int row, int col, Integer[][] mem){

        if(row==1 || col==1){
            return 1;
        }

        if(mem[row][col]!=null){
            return mem[row][col];
        }

        mem[row][col]= mazepathRecDp(row-1,col,mem)+mazepathRecDp(row,col-1,mem);

        return mem[row][col];
    }

    public static int mazeItrDp(int row, int col, int[][] mem){


        for (int i = 1; i <=row ; i++) {

            for (int j = 1; j <=col ; j++) {

                if(i==1 || j==1){

                    mem[i][j] = 1;
                }

                else{
                    mem[i][j] = mem[i-1][j] +mem[i][j-1];
                }
            }
        }
        return mem[row][col];
    }

}
