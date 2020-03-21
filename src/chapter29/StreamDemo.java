package chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется
 * применение потоковых операций.
 *
 * @author Ломовской К.Ю.
 * @since 21.03.2020
 */
public class StreamDemo {

    public static void main(String[] args) {

        // Создать списочный массив значений типа Integer
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Исходный список: " + myList);

        // Получить поток элементов списочного массива
        Stream<Integer> myStream = myList.stream();

        // Получить минимальное и максимальное значения,
        // вызвав методы min(), max(), isPresent(), get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent())
            System.out.println("Минимальное значений: " + minVal.get());

        // Обязательно получить новый поток данных,
        // поскольку предыдущий вызов метода min()
        // является конечной операций, употребивший поток данных
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent())
            System.out.println("Максимальное значение: " + maxVal.get());

        // Отсортировать список даннх, вызвав метод sorted()
        Stream<Integer> sortStream = myList.stream().sorted();

        // Отобразить отсортированный список данных,
        // вызвав метод forEach()
        System.out.print("Отсортированный поток данных: ");
        sortStream.forEach((n)-> System.out.print(n + " "));
        System.out.println();

        // Вывести только нечётные целочисленные значения,
        // вызвав метод filter()
        Stream<Integer> addVal = myList.stream().sorted().filter((n)-> (n % 2) == 1);
        System.out.print("Нечётные значения: ");
        addVal.forEach((n)-> System.out.print(n + " "));
        System.out.println();

        // Вывести только те нечётные целочисленные значения,
        // которые больше 5. Обратите внимание на
        // конвееризацию обеих операций с фильтрами
        addVal = myList.stream().sorted().filter((n)-> (n % 2) == 1).filter((n)-> n > 5);
        System.out.print("Нечётные значения больше 5: ");
        addVal.forEach((n)-> System.out.print(n + " "));
        System.out.println();
    }
}
