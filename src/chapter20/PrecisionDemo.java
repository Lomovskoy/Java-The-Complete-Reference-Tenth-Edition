package chapter20;

import java.util.Formatter;

/**
 * Класс демонстрирующий применение
 * спецификатора точности.
 *
 * @author Ломовской К.Ю.
 * @since 10.02.2020
 */
public class PrecisionDemo {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        // Формат с четырьмя цифрами после десятичной точки
        formatter.format("%.4f", 123.1234567);
        System.out.println(formatter);
        formatter.close();

        // Формат с двумя цифрами после десятичной точки
        // в поле из 16 символов
        formatter = new Formatter();
        formatter.format("%16.2e", 123.1234567);
        System.out.println(formatter);
        formatter.close();

        // Формат выводит максимум 15 символов из строки
        formatter = new Formatter();
        formatter.format("%.15s", "Форматировать в Java теперь очень просто.");
        System.out.println(formatter);
        formatter.close();
    }
}
