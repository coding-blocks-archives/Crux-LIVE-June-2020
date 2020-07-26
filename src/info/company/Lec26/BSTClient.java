package info.company.Lec26;

public class BSTClient {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] pre= {7, 4, 2, 5 ,15, 10, 25};
        int[] in ={2, 4, 5, 7, 10, 15, 25};

//        bst.makefromsorted(sorted,0,sorted.length-1);

        bst.makefromprein(pre,in);
        bst.display();


//        bst.insert(3);
//        bst.insert(5);
//        bst.insert(1);
//        bst.insert(2);
//
//        bst.inrange(5,5);

//        bst.sort();

//        System.out.println(bst.successor(4));

//        bst.display();
    }
}
