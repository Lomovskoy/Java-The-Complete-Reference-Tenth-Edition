package chapter19;

import java.util.ArrayDeque;

/**
 * Класс демонстрирующий применение
 * класса ArrayDeque().
 *
 * @author Ломовской К.Ю.
 * @since 26.08.2019
 */
class ArrayDequeDemo {

    public static void main(String[] args) {

        // Создать двустороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();

        // Использовать класс ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Извлечене из стека: ");

        while (adq.peek() != null)
            System.out.println(adq.pop() + " ");

        System.out.println();
    }
}
