package deques;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> ard = new ArrayDeque<>();

        ard.add("A");
        ard.add("B");
        ard.add("C");
        ard.add("D");

        System.out.println(ard);

        System.out.println("Извлечение стека: ");
        while (ard.peek() != null)
            System.out.println("ard: "+ ard.pop());

        System.out.println();
    }
}
