package info.company.Lec18;

import java.util.Arrays;

public class Stack {

    private int[] ar;

    private int top;

    private int size=0;

    private int DEFAULT_SIZE=10;

    public Stack(){

        this.ar= new int[DEFAULT_SIZE];
        this.top = 0;
    }

    public boolean isFull(){

        return top==ar.length;
    }

    public void push(int element){

//        if(isFull()){
//            return;
//        }
        ar[top++] = element;
        size++;

    }

    public boolean isEmpty(){

        return top==0;
    }

    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("Abey khaali he be");
        }

        size--;
        return ar[--top];
    }

    public int peek(){

        return ar[top-1];
    }

    public void display(){

        for (int i = 0; i <size; i++) {

            System.out.println(ar[i]);
        }
    }

}
