package chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Класс демонстрирующий применение
 * класса URLConnection.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class UCDemo {

    public static void main(String[] args) throws IOException {

        int c;
        URL hp = new URL("http://www.internic.com");
        URLConnection hpCon = hp.openConnection();

        // Получить дату
        long d = hpCon.getDate();

        if (d == 0)
            System.out.println("Сведения о дате не доступны.");
        else
            System.out.println("Дата: " + new Date(d));

        // Получить тип содержимого
        System.out.println("Тип содержимого: " + hpCon.getContentType());

        // Получить дату срока действия ресурса
        d = hpCon.getExpiration();

        if (d == 0)
            System.out.println("Сведения о сроке действия недоступны.");
        else
            System.out.println("Срок действиЯ истекает: " + new Date(d));

        // Получить дату оследнй модификации
        d = hpCon.getLastModified();
        if (d == 0)
            System.out.println("Сведения о дате последней модификации недоступны.");
        else
            System.out.println("Дата последней модификации: " + new Date(d));

        // Получить длинну содержимого
        long len = hpCon.getContentLength();
        if (len == -1)
            System.out.println("Длинна содержимого недоступна.");
        else
            System.out.println("Длинна содержимого: " + len);

        if (len != 0){
            System.out.println("=== Содержимое ===");
            InputStream input = hpCon.getInputStream();
            while ((c = input.read()) != -1){
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Содержимое не доступно");
        }
    }
}
