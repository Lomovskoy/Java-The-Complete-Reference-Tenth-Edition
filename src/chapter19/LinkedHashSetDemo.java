package chapter19;

import java.util.LinkedHashSet;

/**
 * Класс демонстрирующий применение
 * класса LinkedHashSet().
 *
 * @author Ломовской К.Ю.
 * @since 25.08.2019
 */
class LinkedHashSetDemo {

    public static void main(String[] args) {

        // Создаём упорядоченное хеш-множество
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        // Ввести элементы в упорядоченное хеш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
