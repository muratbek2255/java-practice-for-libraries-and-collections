package serializers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadObject {
    public static void main(String[] args) throws FileNotFoundException {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Michael");

        FileOutputStream fos = new FileOutputStream("people.bin");

    }
}
