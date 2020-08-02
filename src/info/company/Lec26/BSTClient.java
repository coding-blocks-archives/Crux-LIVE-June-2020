package info.company.Lec26;

public class BSTClient {

    public static void main(String[] args) {

//        BinarySearchTree bst = new BinarySearchTree();
//
//        int[] pre= {7, 4, 2, 5 ,15, 10, 25};
//        int[] in ={2, 4, 5, 7, 10, 15, 25};
//
////        bst.makefromsorted(sorted,0,sorted.length-1);
//
//        bst.makefromprein(pre,in);
//        bst.display();

        GenericBST<String> bst = new GenericBST<>();


        bst.insert("aaa");
        bst.insert("abc");
        bst.insert("aab");
        bst.insert("aee");
//
//        bst.inrange(5,5);

//        bst.sort();

//        System.out.println(bst.successor(4));

        bst.display();
    }
}
