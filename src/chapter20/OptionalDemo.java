package chapter20;

import java.util.Optional;

/**
 * Класс демонстрирующий применение нескольких
 * методов из обощённого класса Optional.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent())
            System.out.println("Не подлежит выводу");
        else
            System.out.println("Объект noVal не содержит значение");

        if (hasVal.isPresent())
            System.out.println("Объект hasVal содержит следующую строку: " + hasVal.get());

        String defStr = noVal.orElse("Строка по умолчанию");
        System.out.println(defStr);
    }
}
