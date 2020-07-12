package info.company.Lec17;

public class Human {

    int hands=2;

    int eyes =2;


    int bankbalance=10000;

    public void loan(){

        int loan= bankbalance/10;
        bankbalance=bankbalance-loan;

        System.out.println("hayee gareeb ho gya " + bankbalance);
    }

    public static void naamkaran(){
        System.out.println("naa milega");
    }

    public void eat(){

        if(bankbalance<5000){
            System.out.println("nikl yaha se");
            return;
        }
        bankbalance= bankbalance-5000;

    }

}
