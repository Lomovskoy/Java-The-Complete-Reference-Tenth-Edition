package chapter23;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Класс демонстрирующий применение
 * класса HttpURLConnection.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class HttpURLDemo {

    public static void main(String[] args) throws IOException {

        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        // Вывести метод запроса
        System.out.println("Метод зароса: " + hpCon.getRequestMethod());

        // Вывести код ответа
        System.out.println("Код ответа: " + hpCon.getResponseCode());

        // Вывести ответное сообщение
        System.out.println("Ответное сообщние: " + hpCon.getResponseMessage());

        // Получить список полей и множество ключей из заголовка
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("Далее следует заголовок: ");

        // Вывести все ключи и значения из заголовка
        for (String k: hdrField)
            System.out.println("Ключ: " + k + " Значение: " + hdrMap.get(k));
    }
}
