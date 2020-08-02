package info.company.Lec29;

import java.util.*;

public class MapClient {

    public static void main(String[] args) {


        MapUsingAl<String, String> map = new MapUsingAl<>();
        map.put("orange", "gadha");

        map.put("mango", "theek");
        map.put("grape", "delicious");

        System.out.println(map.get("orange"));

        System.out.println(map.get("mango"));

        System.out.println(map.get("grape"));


        System.out.println(map.remove("grape"));

        System.out.println(map.get("orange"));

        System.out.println(map.get("mango"));
        System.out.println(map.get("grape"));


    }
}
