package chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Класс демонстрирующий применение
 * применение сокетов.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class Whois {

    public static void main(String[] args) throws IOException {

        int c;

        // Создать сокетное соединение с
        // веб сокетом internic.net через порт 43
        Socket s = new Socket("whois.internic.net", 43);

        // Получить поток ввода вывода
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        // Сформировать строку зароса
        String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";

        // Преобразовать строку запроса в байты
        byte[] buf = str.getBytes();

        // Послать запрос
        out.write(buf);

        // Прочитать ответ и вывести его на экран
        while ((c = in.read()) != -1){
            System.out.print((char) c);
        }

        s.close();
    }
}
