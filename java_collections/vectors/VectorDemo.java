package vectors;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vecInt = new Vector<>();

        System.out.println("Начальный размер вектора: " + vecInt.size());
        System.out.println("Начальная емкость вектора: "+ vecInt.capacity());

        vecInt.addElement(1);
        vecInt.addElement(2);
        vecInt.addElement(3);
        vecInt.addElement(4);
        vecInt.addElement(5);
        System.out.println("Емкость равна: " + vecInt.capacity());
        System.out.println("First element: " + vecInt.firstElement());
        System.out.println("Last element: " + vecInt.lastElement());

        for (int i:
             vecInt) {
            System.out.println("i: " + i);
        }
    }
}
