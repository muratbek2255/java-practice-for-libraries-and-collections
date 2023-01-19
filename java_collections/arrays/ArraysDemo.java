package arrays;


import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.println("Исходный массив: " + array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + array);

        Arrays.fill(array, 2, 6, -1);
        System.out.println("Filled arrays: " + array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + array);
    }
}
