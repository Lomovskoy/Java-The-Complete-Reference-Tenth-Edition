package chapter30;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * В этой программе демонстрируются
 * применение специального формата даты и времени.
 *
 * @author Ломовской К.Ю.
 * @since 29.03.2020
 */
public class DateTimeDemo3 {

    public static void main(String[] args) {

        LocalDateTime curTime = LocalDateTime.now();
        System.out.println(curTime.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
