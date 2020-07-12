package info.company.Lec19;

public class Queue {

    private int[] ar;

    private int DEFAULT_SIZE=10;

    private int rear = 0;

    public Queue() {

        this.ar = new int[DEFAULT_SIZE];

    }

    private boolean isFull(){
        return rear==ar.length;
    }

    public void insert(int element){

        if(isFull()){
            return;
        }

        ar[rear++]=element;
    }

    private boolean isEmpty(){
        return rear==0;
    }

    public int delete(){

        if (isEmpty()){
            return -1;
        }
// Deletion Cost linear
        int temp = ar[0];

        for (int i = 1; i <rear ; i++) {

            ar[i-1]= ar[i];
        }

        rear--;

        return temp;
    }



}
