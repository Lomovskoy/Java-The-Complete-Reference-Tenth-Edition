package chapter23;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Класс демонстрирующий применение класса URL.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class URLDemo {

    public static void main(String[] args) throws MalformedURLException {

        URL hp = new URL("http://www.herbshild.com/articles");

        System.out.println("Протокол: " + hp.getProtocol());
        System.out.println("Порт: " + hp.getPort());
        System.out.println("Хост: " + hp.getHost());
        System.out.println("Файл: " + hp.getFile());
        System.out.println("Полная форма: " + hp.toExternalForm());

    }
}
