package fabrics;


import java.net.*;

public class InetAddressNet {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);

        InetAddress Sw[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < Sw.length; i++) {
            System.out.println(Sw[i]);
        }
    }
}
