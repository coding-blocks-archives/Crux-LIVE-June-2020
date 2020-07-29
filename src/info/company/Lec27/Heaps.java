package info.company.Lec27;

import java.util.ArrayList;

public class Heaps {

    ArrayList<Integer> list = new ArrayList<>();

    public void insert(int element){

        list.add(element);
        upheap(list.size()-1);
    }

    private void upheap(int index) {

        if (index == 0) {
            return;
        }

        int parent = parent(index);

        if(list.get(parent)>list.get(index)){
            swap(parent,index);
            upheap(parent);
        }
    }

    public int remove(){

        if(list.isEmpty()){
            System.out.println("List is empty");
            return -1;
        }

        int temp = list.get(0);

        int delete = list.remove(list.size()-1);

        if(!list.isEmpty()){

            list.set(0,delete);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {

        int min = index;

        int left = leftchild(index);
        int right =rightchild(index);

        if(left<list.size() && list.get(left)<list.get(min)){
            min = left;
        }

        if(right<list.size() &&list.get(right)<list.get(min)){
            min =right;
        }

        if(min !=index){
            swap(min,index);
            downheap(min);
        }

    }

    public void swap(int first, int second){

        int temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);

    }


    public int parent(int index){

        return (index-1)/2;
    }

    public int leftchild(int index){
        return 2*index+1;
    }

    public int rightchild(int index){
        return 2*index+2;
    }

    public void display(){
        System.out.println(list);
    }
}
