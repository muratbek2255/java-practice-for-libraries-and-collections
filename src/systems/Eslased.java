package systems;

public class Eslased {
    public static void main(String[] args) {
        long start, end = 0;

        System.out.println("Изменение времени перебора");

        start = System.currentTimeMillis();
        for (long i = 0; i < 100000000; i++)
            end = System.currentTimeMillis();

        System.out.println("Время выполнения: " + (end + start));
    }
}
