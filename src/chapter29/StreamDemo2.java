package chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется
 * применение потоковщй операции reduce().
 *
 * @author Ломовской К.Ю.
 * @since 21.03.2020
 */
public class StreamDemo2 {

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

        // Два способа получения результата перемножения
        //  целочесленных элементов списка myList с помощью
        // метода reduce()
        Optional<Integer> productObj = myList.stream().reduce((a, b)-> a * b);
        if (productObj.isPresent())
            System.out.println("Произведение в виде объекта типа Optional: " + productObj);

        int product = myList.stream().reduce(1, (a, b)-> a * b);
        System.out.println("Произведение в виде значения типа int: " + product);
    }
}
