package chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется применение
 * метода trySplit().
 *
 * @author Ломовской К.Ю.
 * @since 24.03.2020
 */
public class StreamDemo10 {

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
        Spliterator<String> splitItr1 = myStream.spliterator();

        // А теперь разделим первый итератор
        Spliterator<String> splitItr2 = splitItr1.trySplit();

        // Используем сначала итератор splitItr2,
        // если нельзя резделить итератор splitItr1
        if (splitItr2 != null){
            System.out.println("Резальтат, выводимый итератором splitItr2: ");
            splitItr2.forEachRemaining(System.out::println);
        }

        // А теперь воспользуемся итератором splitItr1
        System.out.println("\nРезальтат, выводимый итератором splitItr1: ");
        splitItr1.forEachRemaining(System.out::println);
    }
}
