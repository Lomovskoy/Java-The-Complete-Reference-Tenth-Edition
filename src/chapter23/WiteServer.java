package chapter23;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Класс демонстрирующий обработку дейтаграмм.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class WiteServer {

    public static int serverPort = 998;
    public static int clientPort = 999;
    public static int bufferSize = 1024;
    public static DatagramSocket ds;
    public static byte[] buffer = new byte[bufferSize];

    public static void theServer() throws IOException {
        System.out.println("Server run.");
        int pos = 0;
        while (true){
            int c = System.in.read();
            switch (c){
                case -1:
                    System.out.println("Сесвет завершает секнс свзи");
                    ds.close();
                    return;
                case '\r':
                    break;
                case '\n':
                    ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
                    pos = 0;
                    break;
                default:
                    buffer[pos++] = (byte) c;
            }
        }
    }

    public static void theClient() throws IOException {
        System.out.println("Client run.");
        while (true){
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            ds.receive(p);
            System.out.println(new String(p.getData(), 0, p.getLength()));
        }
    }

    public static void main(String[] args) throws IOException {

        if (args.length == 1){
            ds = new DatagramSocket(serverPort);
            theServer();
        } else {
            ds = new DatagramSocket(clientPort);
            theClient();
        }
    }
}
