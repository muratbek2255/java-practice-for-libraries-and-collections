package numbers;


import java.io.*;

public class InfNan {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(1/0.);
        Double d2 = Double.valueOf(0/0.);

        System.out.println(d1 + " "  + d1.isInfinite() + " , " + d1.isNaN());
        System.out.println(d2 + " " + d2.isInfinite() + " , " + d2.isNaN());
    }
}


class ParseDemo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int i;
        int sum = 0;
        System.out.println("Введите число, 0 для выхода.");

        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            }catch (NumberFormatException e) {
                System.out.println("Неверный формат");
                i = 0;
            }
            sum += i;
            System.out.println("sum = " + sum);
        }while (i != 0);
    }
}
