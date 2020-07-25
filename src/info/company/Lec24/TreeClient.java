package info.company.Lec24;

import java.util.Scanner;

public class TreeClient {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        GenericTrees trees = new GenericTrees();

        trees.insert(s);
        trees.display();

        System.out.println(trees.count());
    }
}
