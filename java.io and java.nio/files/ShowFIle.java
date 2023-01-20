package files;


import java.io.*;
import java.nio.file.*;

public class ShowFIle {
    public static void main(String[] args) {
        int i;

        if(args.length != 1) {
            System.out.println("Применение ShowFile test.txt");
            return;
        }

        try (InputStream fin =  Files.newInputStream(Paths.get(args[0]))){
            do {
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            }while (i != -1);
        }catch (InvalidPathException e) {
            System.out.println("Error path: " + e);
        }catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
