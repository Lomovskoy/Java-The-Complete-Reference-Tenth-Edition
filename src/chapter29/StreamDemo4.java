package chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется
 * отображение одного потока данных на другой.
 *
 * @author Ломовской К.Ю.
 * @since 24.03.2020
 */
public class StreamDemo4 {

    public static void main(String[] args) {

        // Создать списочный массив значений типа Double
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // Отобразить квадратные корни элементов из
        // списка myList на новый поток данных
        Stream<Double> sqrtRootStrm = myList.stream().map((a)-> Math.sqrt(a));

        // Получить произведение квадратных корней
        double productOfSqrtRoot = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);

        System.out.println("Произведение квадратных корней равно " + productOfSqrtRoot);

    }
}
