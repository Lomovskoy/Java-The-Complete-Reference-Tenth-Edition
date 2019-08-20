package chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс демонстрирующий использование
 * метода trim() для обработки команд,
 * вводимых пользователем.
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class UseTrim {

    public static void main(String[] args) throws IOException {

        // Создать буферизированный поток чтения данных
        // типа BufferedReader, используя стандарный
        // поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите 'стоп' для заершения.");
        System.out.println("Введите название штата: ");
        do {
            str = br.readLine();
            str = str.trim(); // Удалить пробелы
            if (str.equals("Иллиноис"))
                System.out.println("Столица - Спрингфилд.");
            else if (str.equals("Миссури"))
                System.out.println("Столица - Джеферсон-сити.");
            else if (str.equals("Калифорния"))
                System.out.println("Столица - Сакраменто.");
            else if (str.equals("Вашингтон"))
                System.out.println("Столица - Олимпия");
            //...
        }while (!str.equals("стоп"));
    }
}
