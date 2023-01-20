package files;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannnelWrite {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
            ByteBuffer bMf = ByteBuffer.allocate(128);

            for (int i = 0; i < 26; i++) {
                bMf.put((byte) ('A' + i));

                bMf.rewind();

                fChan.write(bMf);
            }
        }catch (InvalidPathException e) {
            System.out.println("Error path: " + e);
        }catch (IOException e) {
            System.out.println("Error: " + e);
            System.exit(1);
        }
    }
}
