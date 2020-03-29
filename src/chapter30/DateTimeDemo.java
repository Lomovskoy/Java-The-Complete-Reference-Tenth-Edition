package chapter30;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * В этой программе демонстрируются
 * применение классов LocalDate и LocalDateTime.
 *
 * @author Ломовской К.Ю.
 * @since 29.03.2020
 */
public class DateTimeDemo {

    public static void main(String[] args) {

        LocalDate curDate = LocalDate.now();
        System.out.println(curDate);

        LocalDateTime curTime = LocalDateTime.now();
        System.out.println(curTime);
    }
}
