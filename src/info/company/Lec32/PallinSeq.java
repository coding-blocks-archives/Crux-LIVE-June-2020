package info.company.Lec32;

public class PallinSeq {


    public static void main(String[] args) {

        String str = "abcda";
        int[][] mem = new int[str.length()][str.length()];
        System.out.println(pallinItrDep(str,mem));
//        System.out.println(pallinRecDp(str,0,str.length()-1,mem));
//        System.out.println(pallinSeq(str,0,str.length()-1));
    }

    public static int pallinSeq(String str, int start, int end){

        if(start>end){
            return 0;
        }

        if (start == end) {
            return 1;
        }

        if(str.charAt(start)== str.charAt(end)){
             return  2+ pallinSeq(str, start+1, end-1 );
        }
        else{
            return Math.max(pallinSeq(str,start+1,end),pallinSeq(str,start,end-1));
        }
    }

    public static int pallinRecDp(String str, int start, int end, int[][] mem){

        if(start>end){
            return 0;
        }

        if (start == end) {
            return 1;
        }

        if(mem[start][end]!=0){
            return mem[start][end];
        }

        if(str.charAt(start)== str.charAt(end)){
           mem[start][end] =  2+ pallinRecDp(str, start+1, end-1,mem );
        }
        else{
           mem[start][end] = Math.max(pallinRecDp(str,start+1,end,mem),pallinRecDp(str,start,end-1,mem));
        }

        return mem[start][end];
    }

    public static int pallinItrDep(String str, int[][] mem){


        for (int slide = 0; slide <str.length() ; slide++) {

            for (int si = 0; si <=str.length() - slide -1 ; si++) {


                int ei = si + slide;

                if (si == ei) {
                    mem[si][ei]= 1;
                }

                else {
                    if (str.charAt(si) == str.charAt(ei)) {
                        mem[si][ei] = 2 + mem[si + 1][ei - 1];
                    } else {
                        mem[si][ei] = Math.max(mem[si + 1][ei], mem[si][ei - 1]);
                    }
                }
                }
            }
        return mem[0][mem.length-1];
    }

}
