package bytes;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть введены в массив";
        byte buf[] = s.getBytes();

        try {
            f.write(buf);
        }catch (IOException e){
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в символьном виде");
        System.out.println(s.toString());
        System.out.println("В массив");
        byte b[] = f.toByteArray();

        for (int i = 0; i < b.length; i++) {
            System.out.println((char) b[i]);
        }
        System.out.println("\n В поток вывода типа OutputStream()");

        try(FileOutputStream f2 = new FileOutputStream("test.txt")) {
            f.writeTo(f2);
        }catch (IOException e) {
            System.out.println("Error input/output" + e);
            return;
        }
        System.out.println("Ycтaнoвкa в исходное состояние");
        f.reset();
        System.out.println(f.toString());
    }
}
