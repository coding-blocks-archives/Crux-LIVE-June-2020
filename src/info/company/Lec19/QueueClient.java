package info.company.Lec19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClient {

    public static void main(String[] args) {


        CircularQueue queue = new CircularQueue();

        for (int i = 0; i <10 ; i++) {
            queue.insert(i);
            queue.display();
        }

        queue.delete();
        queue.delete();
        System.out.println();
        queue.insert(15);
        queue.insert(17);

        for (int i = 0; i <10 ; i++) {

            queue.delete();
            queue.display();

        }
    }
}
