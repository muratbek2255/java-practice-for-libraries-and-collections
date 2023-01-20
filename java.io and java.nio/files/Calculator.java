package files;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        while (true) {
            System.out.println("Введите число a: ");
            a = scanner.nextInt();
            System.out.println("Введите число b: ");
            b = scanner.nextInt();

            System.out.println("Введите операция над числами:");
            System.out.println("1.+");
            System.out.println("2.-");
            System.out.println("3.*");
            System.out.println("4./");

            int command = scanner.nextInt();

            if (command == 1) {
                c = a + b;
                System.out.println(c);
            } else if (command == 2) {
                c = a - b;
                System.out.println(c);
            } else if (command == 3) {
                c = a * b;
                System.out.println(c);
            } else if (command == 4) {
                c = a / b;
                System.out.println(c);
            }

        }
    }
}
