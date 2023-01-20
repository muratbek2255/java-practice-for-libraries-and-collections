package comparators;

import java.nio.file.Files;
import java.util.*;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String a, b;
        a = o1;
        b = o2;

        return b.compareTo(a);
    }
}


class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> obj1 = new TreeSet<>(new MyComp());

        obj1.add("Michael Owen");
        obj1.add("Leo Messi");
        obj1.add("Van Persie");

        for (String i:
             obj1) {
            System.out.println("player : " + i);
        }
        System.out.println();
    }
}


class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        Comparator<Integer> rise = Collections.reverseOrder();
        Collections.sort(l1, rise);

        System.out.println("Список отсортированы в этом порядке: ");

        for(int i: l1) {
            System.out.println(i + " ");

            System.out.println();

            Collections.shuffle(l1);

            System.out.println("Список перетасован");

            for (int i2: l1) {
                System.out.println(i + " ");

                System.out.println(Collections.min(l1));
                System.out.println(Collections.max(l1));
                System.out.println();
            }
        }
    }
}
