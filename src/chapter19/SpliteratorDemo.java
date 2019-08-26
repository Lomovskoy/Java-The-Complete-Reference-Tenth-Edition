package chapter19;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Класс демонстрирующий простое
 * применение интерфейса Spliterator.
 *
 * @author Ломовской К.Ю.
 * @since 26.08.2019
 */
class SpliteratorDemo {

    public static void main(String[] args) {

        // Создать списочный массив числовых значений
        // типа double
        ArrayList<Double> vals = new ArrayList<>();

        // Ввести значения в список
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Вызвать метод tryAdvance() для вывода содержимого
        System.out.println("Содержимое списочного массива vals: ");
        Spliterator<Double> splitr = vals.spliterator();
        while (splitr.tryAdvance((n) ->
                System.out.println(n)));
        //while (splitr.tryAdvance(System.out::println)); // Более простой способ записи
        System.out.println();

        // Создать новый списочный массив,
        // содержащий квадратные корни числовых
        // значений из списочного массива vals.
        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n)-> sqrs.add(Math.sqrt(n))));

        // Вызвать метод forEachRemaining() для вывода
        // содержимого списочного массива sqrs.
        System.out.println("Содержимое списочного массива sqrs: ");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n)-> System.out.println(n));
        //splitr.forEachRemaining(System.out::println); // Более простой способ записи
        System.out.println();

    }
}
