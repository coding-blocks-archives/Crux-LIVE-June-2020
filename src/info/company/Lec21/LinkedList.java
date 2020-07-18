package info.company.Lec21;

public class LinkedList {

    Node head;
    int size = 0;
    Node tail;

    public void insertfirst(int element){

        Node node = new Node(element);
        node.next= head;
        head = node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertlast(int element){

        if(size==0){
            insertfirst(element);
            return;
        }

        Node node = new Node(element);

        tail.next = node;

        tail = node;

        size++;
    }


    public void display(){

        Node temp = head;

        while(temp!=null){

            System.out.print(temp.value +"->");
            temp=temp.next;
        }

        System.out.println("null");
    }

    public class Node{

        int value ;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
