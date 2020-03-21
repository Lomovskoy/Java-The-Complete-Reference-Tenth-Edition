package chapter29;

import java.util.ArrayList;
import java.util.Optional;

/**
 * В этой программе демонстрируется
 * применение объеденяющей формы вмеместо
 * потоковщй операции reduce().
 *
 * @author Ломовской К.Ю.
 * @since 21.03.2020
 */
public class StreamDemo3 {

    public static void main(String[] args) {

        // Создать списочный массив значений типа Double
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        System.out.println("Исходный список: " + myList);

        double productOfSqrRoots = myList.parallelStream().reduce(
                1.0, (a, b)-> a * Math.sqrt(b),
                (a, b)-> a * b);

        System.out.println("Произведение квадратных корней: " + productOfSqrRoots);
    }
}
