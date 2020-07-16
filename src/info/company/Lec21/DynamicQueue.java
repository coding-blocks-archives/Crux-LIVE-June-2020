package info.company.Lec21;

import info.company.Lec19.CircularQueue;

public class DynamicQueue extends CircularQueue {

    @Override
    public void insert(int element) {

        if(isFull()){

            int[] data = new int[2*ar.length];

            for (int i = 0; i <size ; i++) {

                data[i]= ar[(front+i)%ar.length];
            }

            front =0;

            rear =ar.length;

            ar=data;
        }
        super.insert(element);
    }
}
