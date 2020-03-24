package chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется применение
 * итератора для потока данных.
 *
 * @author Ломовской К.Ю.
 * @since 24.03.2020
 */
public class StreamDemo8 {

    public static void main(String[] args) {

        // Создать список символьных строк
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        // Получить поток данных из писочного массива
        Stream<String> myStream = myList.stream();

        // Получить итератор для потока данных
        Iterator<String> itr = myStream.iterator();

        // Перебрать элементы в потоке данных
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
