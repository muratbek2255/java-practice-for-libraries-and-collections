package files;

import java.io.File;

public class FileDemo {
    static  void  p(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT");
        p("Имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Absolute path: " + f1.getAbsolutePath());
        p("Parent path: " + f1.getParent());
        p(f1.exists() ? "существует" : "не сущестует");
        p(f1.canWrite() ? "доступен для записи" : "не доступен для записи");
    }
}
