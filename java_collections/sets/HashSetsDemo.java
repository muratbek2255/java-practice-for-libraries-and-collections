package sets;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetsDemo {
    public static void main(String[] args) {
        HashSet<String> als = new HashSet<>();

        als.add("A");
        als.add("N");
        als.add("B");
        als.add("C");

        System.out.println(als);
    }
}


class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> trs = new TreeSet<>();

        trs.add("A");
        trs.add("B");
        trs.add("C");
        trs.add("D");

        System.out.println(trs);
    }
}
