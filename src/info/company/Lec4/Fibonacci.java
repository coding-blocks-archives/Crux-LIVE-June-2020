package info.company.Lec4;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 4;

        int f = 0;

        int s = 1 ;

        while(n > 0){

            int t = f + s;
            f = s;
            s = t;
            n = n - 1;
        }
        System.out.println(f);
    }
}
