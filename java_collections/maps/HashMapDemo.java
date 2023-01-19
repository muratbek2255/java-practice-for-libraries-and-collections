package maps;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hshMp = new HashMap<>();

        hshMp.put("Leo Smith", 987.90);
        hshMp.put("Cris Marc", 347.90);
        hshMp.put("Mike Smith", 456.87);

        Set<Map.Entry<String, Double>> set = hshMp.entrySet();

        for(Map.Entry<String, Double> me: set) {
            System.out.println("key: " + me.getKey());
            System.out.println("value: " + me.getValue());
        }
        System.out.println();

        double balance = hshMp.get("Leo Smith");
        hshMp.put("Leo Smith", balance + 100);
        System.out.println("Leo Smith: " + hshMp.get("Leo Smith"));
    }
}


class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> trMp = new TreeMap<>();

        trMp.put("Michael Owen", 87);
        trMp.put("Leo Messi", 97);
        trMp.put("Van Persie", 105);

        Set<Map.Entry<String, Integer>> set = trMp.entrySet();

        for(Map.Entry<String, Integer> me: set) {
            System.out.println("player: " + me.getKey());
            System.out.println("goal: " + me.getValue());
        }
        System.out.println();

        int goal = trMp.get("Van Persie");
        trMp.put("Van Persie", goal + 100);
        System.out.println("Van Persie: " + trMp.get("Van Persie"));
    }
}
