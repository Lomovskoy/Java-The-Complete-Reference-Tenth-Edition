package chapter30;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * В этой программе демонстрируются
 * применение синтаксичского анализа даты и времени.
 *
 * @author Ломовской К.Ю.
 * @since 29.03.2020
 */
public class DateTimeDemo4 {

    public static void main(String[] args) {

        // Получить объект типа LocalDateTime,
        // выполнив синтаксический анализ симовльной
        // строки даты и времени
        LocalDateTime curTime = LocalDateTime.parse("марта 21, 2017 12:01 ПП",
                DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));

        // Отобразить пороанализированную дату и время
        System.out.println(curTime.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
