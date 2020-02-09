package chapter20;

import java.util.Formatter;

/**
 * Класс демонстрирующий применение
 * спецификаторов %f %d в рамках класса Formatter.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class FormatDemo2 {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        for (double i = 11.23; i < 1.0e+6; i *= 100){
            formatter.format("%f %e", i, i);
            System.out.println(formatter);
        }

        formatter.close();
    }
}
