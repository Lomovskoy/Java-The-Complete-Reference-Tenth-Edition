package chapter19;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Класс демонстрирующий применение
 * различных алгоритмов коллекций.
 *
 * @author Ломовской К.Ю.
 * @since 08.02.2020
 */
public class AlgorithmsDemo {

    public static void main(String[] args) {

        // Создать неинициализированный связанный список
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);

        // Создать компаратор с обратный упорядочением
        Comparator<Integer> comparator = Collections.reverseOrder();

        // Отсортировать список с помощью этого компаратора
        Collections.sort(linkedList, comparator);

        System.out.print("Список отсортированный в обратном порядке: ");

        for (int i: linkedList)
            System.out.print(i + " ");

        System.out.println();

        // Перетасовать список
        Collections.shuffle(linkedList);

        // Вывести перетасованный сисок
        System.out.print("Список перетасован: ");

        for (int i: linkedList)
            System.out.print(i + " ");

        System.out.println();

        System.out.println("Минимум:  " + Collections.min(linkedList));
        System.out.println("Максимум: " + Collections.max(linkedList));
    }
}
