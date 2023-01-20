package files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream("FileInputStreamDemo.java")) {
            System.out.println("Общее количество доступных" + "байтов: " + (size = f.available()));
            int n = size / 40;
            System.out.println("Первые " + n + " байтов, " + "прочитанных по очереди " + "methods read()");
            for (int i = 0; i < n; i++) {
                System.out.println((char)  f.read());
            }
            System.out.println("\n Все еще доступно: " + f.available());
            System.out.println("\n Чтение следующих " + n + "байтов.");

            byte b[] = new byte[n];
            if(f.read(b) != n) {
                System.err.println("Нельзя прочитать : " + n + "байтов");
            };
            System.out.println(new String(b, 0, n));
            System.out.println("\n Все еще доступно: " + (size = f.available()));
            System.out.println("Пропустить");
            f.skip(size/2);
            System.out.println("\n Все еще доступно: " + (size = f.available()));
            System.out.println("Чтение массивов: " + n/2);

            if(f.read(b, n/2, n/2) != n/2) {
                System.err.println("Нельзя прочитать " + n/2);
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\n Все еще доступно: " + (size = f.available()));
        }catch (IOException e) {
            System.out.println("Ошибка ввода/вывода");
        }
    }
}
