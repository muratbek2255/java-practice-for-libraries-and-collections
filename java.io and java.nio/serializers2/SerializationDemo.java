package serializers2;

import java.io.*;

import serializers2.Myclass;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        try(ObjectOutputStream objOrm = new ObjectOutputStream(new FileOutputStream("serial")))
        {
            Myclass object1 = new Myclass("Hello", 2.7e10, -7);
            System.out.println("object 1: " + object1);

            objOrm.writeObject(object1);
        }catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try(ObjectInputStream objIrm = new ObjectInputStream(new FileInputStream("serial")))
        {
            Myclass object2 = (Myclass) objIrm.readObject();
            System.out.println("object 2: " + object2);
        }catch (IOException | ClassNotFoundException e) {
            System.out.println("Исключение при сериализации: " + e);
            System.exit(0);
        }
    }
}
