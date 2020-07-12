package info.company.Lec13;

public class Numpad {

    public static void main(String[] args) {

        numpad("", "194");
    }

    public static void numpad(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0)-'0';
        unprocessed= unprocessed.substring(1);

        for (int i = 3*(digit-1); i <3*digit ; i++) {

            if(i==26){
                continue;
            }

            numpad(processed + (char)(i+'a'), unprocessed);
        }
    }
}
