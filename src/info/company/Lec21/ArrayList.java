package info.company.Lec21;

public class ArrayList {

    private int[] data;

    private int DEFAULT_SIZE= 10;

    private int size;

    public ArrayList() {

        this.data = new int[DEFAULT_SIZE];
        size=0;
    }

    public boolean isfull(){

        return size== data.length;
    }

    public void add(int element){

        if(isfull()){
            resize();
        }
        data[size++] = element;
    }

    private void resize() {

        System.out.println("me badal gya");
        int[] ar = new int[2*data.length];

        for (int i = 0; i <data.length; i++) {

            ar[i]=data[i];
        }

        data = ar;
    }

    public int size(){
        return size;
    }

    public int get(int index){

        return data[index];

    }

    public void set(int index, int element){

        data[index]= element;
    }

    public int remove(){

        int temp = data[size-1];

        size--;

        return temp;
    }

}
