package info.company.Lec19;

public class Optimizedqueue {

    private int[] ar;

    private int DEFAULT_SIZE=10;

    private int rear = 0;

    private int front= 0;

    int size=0;

    public Optimizedqueue() {

        this.ar = new int[DEFAULT_SIZE];

    }

    private boolean isFull(){
        return size==ar.length;
    }

    public void insert(int element){

        if(isFull()){
            return;
        }

        ar[rear++]=element;
        size++;
    }

    private boolean isEmpty(){
        return size==0;
    }

    public int delete(){

        if (isEmpty()){
            return -1;
        }
        int temp = ar[front];

//        for (int i = 1; i <rear ; i++) {
//
//            ar[i-1]= ar[i];
//        }

        front++;
        size--;
        return temp;
    }



}
