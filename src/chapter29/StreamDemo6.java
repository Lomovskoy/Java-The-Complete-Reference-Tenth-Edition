package chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется отображение потока
 * данных типа Stream на поток данных тима IntStream.
 *
 * @author Ломовской К.Ю.
 * @since 24.03.2020
 */
public class StreamDemo6 {

    public static void main(String[] args) {

        // Создать списочный массив значений типа Double
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.println("Исходные элементы из спика myList: ");
        myList.forEach((a)->
                System.out.print(a + " ")
        );
        System.out.println();

        // Отобразить максимально допустимый предел каждого
        // значения из списка myList на поток данных типа IntStream
        IntStream cStrm = myList.stream().mapToInt((a)-> (int) Math.ceil(a));

        System.out.println("Максимально допустимые элементы из спика myList: ");
        cStrm.forEach((a)->
                System.out.print(a + " ")
        );
    }
}
