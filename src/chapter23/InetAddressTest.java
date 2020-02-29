package chapter23;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Класс демонстрирующий применение
 * применение класса InetAddressTest.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.herbschildt.com");
        System.out.println(address);

        InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
        for (InetAddress addr: sw){
            System.out.println(addr);
        }
    }
}
