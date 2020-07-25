package info.company.Lec24;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTrees {

    Node root;

    public void insert(Scanner s){

        System.out.println("Enter the calue of root node");
        int val = s.nextInt();
        this.root = new Node(val);
        insert(root, s);
    }

    private void insert(Node node, Scanner s) {

        while(true){

            System.out.println("Do you want to add child of " + node.value);

            boolean yes = s.nextBoolean();

            if(yes){

                System.out.println("Enter the value for child node");
                int val = s.nextInt();
                Node child = new Node(val);
                node.children.add(child);
                insert(child, s);
            }

            else{
                break;
            }
        }
    }

    public int count(){

        return count(root);
    }

    private int count(Node node) {

        int cnt = 1;

        for (int i = 0; i <node.children.size() ; i++) {

            cnt += count(node.children.get(i));
        }

        return cnt;
    }

    public void display(){

        display(root, "");
    }

    private void display(Node node, String indent){

        System.out.println(indent+node.value);

        for (int i = 0; i <node.children.size() ; i++) {

            display(node.children.get(i), indent+"\t");
        }

    }




    public class Node{

       int value;
       ArrayList<Node> children;

       public Node(int value) {
           this.value = value;
           this.children = new ArrayList<>();
       }
   }
}
