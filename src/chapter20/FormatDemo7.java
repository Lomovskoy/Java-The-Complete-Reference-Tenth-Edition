package chapter20;

import java.util.Formatter;

/**
 * Класс демонстрирующий автоматическое
 * управление ресурсами для закрытия объекта типа Formatter.
 *
 * @author Ломовской К.Ю.
 * @since 11.02.2020
 */
public class FormatDemo7 {

    public static void main(String[] args) {

        try (Formatter formatter = new Formatter()){
            formatter.format("Форматировать %s просто %d %f", "средствами Java", 10, 98.6);
            System.out.println(formatter);
        }

    }
}
