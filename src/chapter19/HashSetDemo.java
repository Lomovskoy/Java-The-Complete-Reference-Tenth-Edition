package chapter19;

import java.util.HashSet;

/**
 * Класс демонстрирующий применение
 * класса HashSet().
 *
 * @author Ломовской К.Ю.
 * @since 25.08.2019
 */
class HashSetDemo {

    public static void main(String[] args) {

        // Создаём хеш-множество
        HashSet<String> hs = new HashSet<String>();

        // Ввести элементы в хеш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
