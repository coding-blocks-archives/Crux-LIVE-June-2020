package info.company.Lec20;

public class User {

    public static void main(String[] args) {

        Mariov2 mario1 = new Mariov2();

        mario1.jump();

        mario1.saviour();
        mario1.move();
        System.out.println(mario1.hands);

        mario1.meredushman();

//        sum(1,2,3);
    }

    public static void sum(int ...ar){

        int sum =0;

        for (int i = 0; i <ar.length ; i++) {

            sum = sum + ar[i];
        }

        System.out.println(sum);
    }
}