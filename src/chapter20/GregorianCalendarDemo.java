package chapter20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Класс демонстрирующий применение
 * класса GregorianCalendar.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class GregorianCalendarDemo {

    public static void main(String[] args) {

        String[] month = {
                "Jan", "Feb", "Mar",
                "Apr", "May", "Jun",
                "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec"
        };

        int year;

        // Создать грегорианский календарь, инициируемый
        // текущей  датой и временем с учётом региональных
        // настроек и часового пояса по умолчанию
        GregorianCalendar gCalendar = new GregorianCalendar();

        // Вывесвти текущую дату и время
        System.out.print("Дата: ");
        System.out.print(month[gCalendar.get(Calendar.MONTH)] + " ");
        System.out.print(gCalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gCalendar.get(Calendar.YEAR));

        System.out.print("Время: ");
        System.out.print(gCalendar.get(Calendar.HOUR) + ":");
        System.out.print(gCalendar.get(Calendar.MONTH) + ":");
        System.out.println(gCalendar.get(Calendar.SECOND));

        // Проверить, является ли текущий год высокосным
        if (gCalendar.isLeapYear(year)){
            System.out.println("Текущий год высокосный");
        }
        else {
            System.out.println("Текущий год не высокосный");
        }

    }
}
