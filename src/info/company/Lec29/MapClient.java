package info.company.Lec29;

public class MapClient {

    public static void main(String[] args) {


        MapUsingArray map = new MapUsingArray();

        map.put("orange", "gadha");

        map.put("mango", "theek");
        map.put("grape", "delicious");


        System.out.println(map.get("orange"));
    }
}
