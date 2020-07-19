package info.company.Lec22;


public class LinkedClient {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertlast(1);

        list.insertlast(5);
        list.insertlast(6);

//        System.out.println(list.deleteindex(2));
        list.insertlast(15);

        list.reverse();//        list.insertlast(10);
//
//        list.deletelast();
//
//        list.insertlast(14);

        System.out.println(list.size);
//        System.out.println(list.deleteindex(0));

//        list.insertfirst(10);
//
//        list.insertfirst(5);
//        list.insertmid(1,8);

//        list.insertmid(3,9);

//        list.insertmid(0,10);

//        System.out.println(list.deletefirst());
//
//        System.out.println(list.deletefirst());

        list.display();
    }
}
