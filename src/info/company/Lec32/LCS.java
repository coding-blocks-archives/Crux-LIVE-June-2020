package info.company.Lec32;

public class LCS {

    public static void main(String[] args) {


        System.out.println(LCSRec("aba","aaaaaaaaaaa"));

        String s1= "aba";
        String s2= "abda";
        int[][] mem = new int[s1.length()+1][s2.length()+1];
        System.out.println(LCSIterativeDP(s1,s2,mem));


    }

    public static int LCSRec(String s1, String s2){

        if(s1.length()==0 ||s2.length()==0){
            return 0;
        }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if(f==s){

            return LCSRec(s1.substring(1),s2.substring(1))+1;
        }

        else{
            return Math.max(LCSRec(s1.substring(1),s2),LCSRec(s1,s2.substring(1)));
        }
    }

    public static int LCSrecDP(String s1, String s2, int[][] mem) {

        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        if(mem[s1.length()][s2.length()]!=0){

            return mem[s1.length()][s2.length()];
        }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if (f == s) {
            mem[s1.length()][s2.length()] = LCSrecDP(s1.substring(1), s2.substring(1),mem) + 1;
        } else {
            mem[s1.length()][s2.length()] = Math.max(LCSrecDP(s1.substring(1), s2,mem), LCSrecDP(s1, s2.substring(1),mem));
        }

        return mem[s1.length()][s2.length()];
    }

    public static int LCSIterativeDP(String s1, String s2, int[][] mem){

        for (int i = 0; i <=s1.length() ; i++) {

            for (int j = 0; j <=s2.length(); j++) {


                if (i==0 || j==0){
                    mem[i][j]=0;
                }

                else{

                    if(s1.charAt(i-1)==s2.charAt(j-1)){

                        mem[i][j] = mem[i-1][j-1] + 1;
                    }

                    else{

                        mem[i][j]= Math.max(mem[i-1][j],mem[i][j-1]);
                    }
                }
            }
        }
        return mem[s1.length()][s2.length()];
    }
}

