package chapter20;

import java.util.Date;

/**
 * Класс демонстрирующий применение
 * класса Date, что бы вывести дату и время.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class DateDemo {

    public static void main(String[] args) {

        // Создать объект типа Date
        Date date = new Date();

        // Вывести дату и время методом toString()
        System.out.println(date);

        // Вывести колличество миллисекунд, прошедших
        // с 1 января 1970 г. по Гринвичу
        long mSec = date.getTime();
        System.out.println("Колличество миллисекунд, прошедших с " +
                            "1 января 1970 г. по Гринвичу = " + mSec);
    }
}
