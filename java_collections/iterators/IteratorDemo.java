package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList<>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        System.out.println("al: ");
        Iterator<String> aliter = al.iterator();
        while(aliter.hasNext()) {
            String element = aliter.next();
            System.out.println(element +  " ");
        }
        System.out.println();

        ListIterator<String> listAlIter = al.listIterator();
        while (listAlIter.hasNext()) {
            String element2 = listAlIter.next();
            System.out.println(element2 + "+");
        }
        System.out.println();


    }
}


class SplitOperatorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arInt= new ArrayList<>();

        arInt.add(1);
        arInt.add(2);
        arInt.add(3);
        arInt.add(4);
        arInt.add(5);

        System.out.println("Содержимое списочного массива vals");
        Spliterator<Integer> splitIt = arInt.spliterator();
        while (splitIt.tryAdvance((n) ->
                System.out.println(n)));
        System.out.println();

        splitIt = arInt.spliterator();
        ArrayList<Integer> sqrs = new ArrayList<>();
        while (splitIt.tryAdvance((n) -> sqrs.add((int) Math.sqrt(n))));

        System.out.println();
        splitIt = sqrs.spliterator();
        splitIt.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
