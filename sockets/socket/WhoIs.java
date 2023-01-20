package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIs {
    public static void main(String[] args) throws IOException {
        int c = 0;

        Socket sock = new Socket("whois.internet.net", 43);

        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();

        String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";
        byte buf[] = str.getBytes();

        out.write(buf);

        while(((c = in.read()) != -1)) {
            System.out.println((char) c);
        }

        sock.close();
    }
}
