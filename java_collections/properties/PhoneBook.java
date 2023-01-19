package properties;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fl = null;
        boolean changed = false;

        try{
            fl = new FileInputStream("phonebook.dat");
        }catch (FileNotFoundException e) {
        }

        try{
            if(fl != null) {
                ht.load(fl);
                fl.close();
            }
        }catch (IOException e) {
            System.out.println("Ошибка чтение файла");
        }

        do {
            System.out.println("Введите имя" + "('выход' для завершения)'");
            name = br.readLine();
            if(name.equals("выход")) break;
            System.out.println("Vvedite nomer");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        }while (!name.equals("выход"));

        if(changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }

        do {
            System.out.println("Введите имя для поиска" + "('выход' для завершения)'");
            name = br.readLine();
            if(name.equals("выход")) break;
            number = (String) ht.get(name);
            System.out.println(number);
        }while (!name.equals("выход"));
    }
}
