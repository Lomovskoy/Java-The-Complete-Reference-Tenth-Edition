package chapter19;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Класс демонстрирующий применение
 * специального компаратора принимающего лямбда-выражение.
 *
 * @author Ломовской К.Ю.
 * @since 27.08.2019
 */
class CompLDemo {

    public static void main(String[] args) {

        // Создаём древовидное множество и использовать
        // лямбда-выражение для реализации компаратора с
        // обратным порядком
        TreeSet<String> ts = new TreeSet<>((a, b) ->b.compareTo(a));
        //TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder()); // Успрощённый вариант из коробки.

        // Ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Вывести элементы из древовидного множества
        for (String element: ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
