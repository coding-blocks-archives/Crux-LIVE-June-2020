package info.company.Lec18;

public class StackClient {

    public static void main(String[] args) throws Exception{

        Stack stack = new Stack();


        try {
           System.out.println(stack.pop());
           System.out.println(stack.pop());
           System.out.println(stack.pop());
       }

       catch (Exception e){
           System.out.println(e.getMessage());
       }

//       stack.display();

        System.out.println("hello");

    }
}
