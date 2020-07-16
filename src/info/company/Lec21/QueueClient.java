package info.company.Lec21;

import info.company.Lec19.Queue;

public class QueueClient {

    public static void main(String[] args) {

        DynamicQueue queue = new DynamicQueue();

        for (int i = 0; i <100 ; i++) {
            queue.insert(i);
        }

        for (int i = 0; i <100 ; i++) {
            System.out.println(queue.delete());
        }
    }
}