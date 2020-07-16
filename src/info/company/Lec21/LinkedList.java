package info.company.Lec21;

public class LinkedList {

    Node head;

    public void insertfirst(int element){

        Node node = new Node(element);
        node.next= head;
        head = node;
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
