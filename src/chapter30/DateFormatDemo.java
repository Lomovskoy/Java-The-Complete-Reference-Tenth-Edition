package chapter30;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * В этой программе демонстрируются
 * различные форматы дат.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class DateFormatDemo {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat;

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Япония: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Корея: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("Велиобритания: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("США: " + dateFormat.format(date));
    }
}
