package info.company.LondonBank;

import info.company.Lec21.Bank;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BankLA  {

    public static void main(String[] args) {

        Bank ba = new Bank();


        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(1);


        System.out.println(queue.remove());

        System.out.println(queue.remove());
    }
}
