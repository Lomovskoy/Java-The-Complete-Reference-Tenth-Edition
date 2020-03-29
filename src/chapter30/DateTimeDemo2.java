package chapter30;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * В этой программе демонстрируются
 * применение класса DateTimeFormatter.
 *
 * @author Ломовской К.Ю.
 * @since 29.03.2020
 */
public class DateTimeDemo2 {

    public static void main(String[] args) {

        LocalDate curDate = LocalDate.now();
        System.out.println(curDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        LocalDateTime curTime = LocalDateTime.now();
        System.out.println(curTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    }
}
