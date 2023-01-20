package files;

import files.FileDemo;

import java.io.File;

public class FileDirectory {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);

        if (f1.isDirectory()) {
            System.out.println("Каталог: " + dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                if(f1.isDirectory()) {
                    System.out.println(s[i] + "является каталогом");
                }else {
                    System.out.println(s[i] + "не является каталогом");
                }
            }
        }else {
            System.out.println(dirname + " не является каталогом");
        }
    }
}
