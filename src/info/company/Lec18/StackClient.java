package info.company.Lec18;

import java.util.Stack;

public class StackClient {

    public static void main(String[] args) throws Exception{


        Stack stack = new Stack();
        stack.push(2);


       try {
           System.out.println(stack.pop());
           System.out.println(stack.pop());
           System.out.println(stack.pop());
       }

       catch (Exception e){
           System.out.println(e.getMessage());
       }

      finally {
           System.out.println("to kese he aap log");
       }

//       stack.display();

        System.out.println("hello");

    }
}
