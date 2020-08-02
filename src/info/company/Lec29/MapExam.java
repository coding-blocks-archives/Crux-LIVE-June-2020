package info.company.Lec29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapExam {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        String str = "abc";

        System.out.println(str.hashCode());

        System.out.println(map.get("orange"));

        map.put("orange", "bekaar he");
        map.put("mango", "theek thak");
        map.put("apple", "keeps doctor away");

        System.out.println(map.get("orange"));

        System.out.println(map);


        for (String s : map.values()) {
            System.out.println(s);
        }


        System.out.println(freq("Raftaar"));
    }

    public static HashMap<Character, Integer> freq(String s){

        HashMap<Character, Integer> freq = new HashMap<>();


        for (int i = 0; i <s.length() ; i++) {

            char ch =s.charAt(i);


            if(freq.containsKey(ch)){

                freq.put(ch, freq.get(ch)+1);
            }

            else{

                freq.put(ch, 1);
            }
        }

        return freq;
    }
}
