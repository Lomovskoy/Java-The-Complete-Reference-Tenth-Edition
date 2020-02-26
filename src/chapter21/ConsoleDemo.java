package chapter21;

import java.io.Console;

/**
 * Класс демонстрирующий применение
 * класса Console.
 *
 * @author Ломовской К.Ю.
 * @since 26.02.2020
 */
public class ConsoleDemo {

    public static void main(String[] args) {

        String str;
        Console con;

        // Получить ссылку на консоль
        con = System.console();

        // Выйти из программы если консоль не доступна
        if (con == null) return;

        // Прочитать строку и вывести её
        str = con.readLine("Введите строку: ");
        con.printf("Введённая вами строка: %s\n", str);
    }
}
