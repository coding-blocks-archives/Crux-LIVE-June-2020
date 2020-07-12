package info.company.Lec5;

import java.util.Scanner;

public class Convertre {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int bin =s.nextInt();
        System.out.println(bin2deci(bin));
        System.out.println(decitobin(5));

    }

    public static int bin2deci(int bin){

        int deci =0;

        int place=1;

        while(bin>0){

            int r = bin%10;
            bin=bin/10;
            deci = deci + r*place;
            place =place * 2;
        }
        return deci;
    }


    public static int any2deci(int any, int base){

        int deci =0;

        int place=1;

        while(any>0){

            int r = any%10;
            any=any/10;
            deci = deci + r*place;
            place =place * base;
        }
        return deci;
    }

    public static int decitobin(int deci){

        int bin =0;

        int place=1;

        while(deci>0){

            int r = deci%2;
            deci=deci/2;
            bin = bin + r*place;
            place =place * 10;
        }
        return bin;
    }

    public static int anytobin(int deci, int base){

        int any =0;

        int place=1;

        while(deci>0){

            int r = deci%base;
            deci=deci/base;
            any = any + r*place;
            place =place * 10;
        }
        return any;
    }
}
