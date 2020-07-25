package info.company.Lec25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryTreeClient {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input");
        BinaryTree tree = new BinaryTree();
        Scanner s = new Scanner(file);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);


        tree.postorder();
        System.out.println();
        tree.inorder();
        System.out.println();
        tree.display();

        System.out.println(tree.height());

        System.out.println();
        tree.levelorder();

        System.out.println(tree.diameter());
    }
}
