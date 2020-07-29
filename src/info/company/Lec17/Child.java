package info.company.Lec17;

public class Child {

    public static void main(String[] args) {


        Human jagjeet = new Human();
        System.out.println(jagjeet.bankbalance);

        jagjeet.loan();
        jagjeet.eat();
        jagjeet.eat();

        Human mohan = new Human();
        System.out.println(mohan.bankbalance);

    }
}
