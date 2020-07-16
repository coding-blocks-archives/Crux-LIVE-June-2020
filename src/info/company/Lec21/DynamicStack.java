package info.company.Lec21;

import info.company.Lec18.Stack;

public class DynamicStack extends Stack {

    @Override
    public void push(int element) {

        if(isFull()){
            System.out.println("me badal gya");
            int[] data = new int[2*ar.length];

            for (int i = 0; i <ar.length; i++) {

                data[i]=ar[i];
            }

            ar= data;
        }
        super.push(element);
    }
}
