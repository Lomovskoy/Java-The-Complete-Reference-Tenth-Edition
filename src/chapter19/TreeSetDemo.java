package chapter19;

import java.util.TreeSet;

/**
 * Класс демонстрирующий применение
 * класса TreeSet().
 *
 * @author Ломовской К.Ю.
 * @since 25.08.2019
 */
class TreeSetDemo {

    public static void main(String[] args) {

        // Создаём древовидное множество
        TreeSet<String> ts = new TreeSet<String>();

        // Ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
        System.out.println(ts.subSet("C", "F"));
    }
}
