package memories;

public class Memory {
        public static void main(String[] args) {
                Runtime r = Runtime.getRuntime();
                long mem1, mem2;
                Integer someints[] = new Integer[1000];

                System.out.println("Всего в памяти: " + r.totalMemory());
                mem1 = r.freeMemory();
                System.out.println("Свободной пвмяти исходно: " + mem1);
                r.gc();
                mem1 = r.freeMemory();
                System.out.println("Свободной памяти исходно после очистки: " + mem1);

                for (int i = 0; i < 1000; i++)
                        someints[i] = new Integer(i);


                mem2 = r.freeMemory();
                System.out.println("Свободной памяти после выделения: " + mem2);
                System.out.println("Свободной памяти для выделения: " + (mem1 - mem2));

                for (int i = 0; i < 1000; i++) someints[i] = null;
                r.gc();
                mem2 = r.freeMemory();
                System.out.println("Свлбодная память после очистки: " + mem2);
        }
}