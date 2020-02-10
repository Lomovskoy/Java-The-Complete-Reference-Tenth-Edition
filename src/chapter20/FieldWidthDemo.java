package chapter20;

import java.util.Formatter;

/**
 * Класс демонстрирующий таблицу
 * квадратов и кубов заданных чисел.
 *
 * @author Ломовской К.Ю.
 * @since 10.02.2020
 */
public class FieldWidthDemo {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        for (int i = 1; i <= 10; i++){
            formatter = new Formatter();
            formatter.format("%4d %4d %4d", i, i * i, i * i * i);
            System.out.println(formatter);
            formatter.close();
        }
    }
}
