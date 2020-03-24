package chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется применение
 * итератора-разделителя для потока данных.
 *
 * @author Ломовской К.Ю.
 * @since 24.03.2020
 */
public class StreamDemo9 {

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

        // Получить итератор-разделитель для потока данных
        Spliterator<String> splitItr = myStream.spliterator();

        // Перебрать элементы в потоке данных
        while (splitItr.tryAdvance((n)-> System.out.println(n)));
        // while (splitItr.tryAdvance(System.out::println));

        System.out.println();
        myStream = myList.stream();
        splitItr = myStream.spliterator();
        splitItr.forEachRemaining((n)-> System.out.println(n));
        // splitItr.forEachRemaining(System.out::println);
    }
}
