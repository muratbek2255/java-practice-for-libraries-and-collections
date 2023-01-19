package string_tokenaizers;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class STDemo {

    static String in = "Hello guys; so diffucult=hard;";
    public static void main(String[] args) throws NoSuchElementException {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
