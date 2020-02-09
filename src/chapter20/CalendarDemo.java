package chapter20;

import java.util.Calendar;

/**
 * Класс демонстрирующий применение
 * класса Calendar.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class CalendarDemo {

    public static void main(String[] args) {

        String[] month = {
                "Jan", "Feb", "Mar",
                "Apr", "May", "Jun",
                "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec"
        };

        // Создать календарь, инициируемый текущей
        // датой и временем с учётом региональных
        // настроек и часового пояса по умолчанию
        Calendar calendar = Calendar.getInstance();

        // Вывесвти текущую дату и время
        System.out.print("Дата: ");
        System.out.print(month[calendar.get(Calendar.MONTH)] + " ");
        System.out.print(calendar.get(Calendar.DATE) + " ");
        System.out.println(calendar.get(Calendar.YEAR));

        System.out.print("Время: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MONTH) + ":");
        System.out.println(calendar.get(Calendar.SECOND));

        // Установить дату и время и вывести их
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 29);
        calendar.set(Calendar.SECOND, 22);

        System.out.print("Изменённое время: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MONTH) + ":");
        System.out.println(calendar.get(Calendar.SECOND));

    }
}
