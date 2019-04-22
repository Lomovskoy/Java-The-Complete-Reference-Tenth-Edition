package chapter5;

/**
 * Программа демонстрирующая,
 * применение цикла for в стиле for each.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
public class ForEach {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Использовать цикл for в стиле for each дляч вывода
        // и суммирвоания значений
        for (int x: nums){
            System.out.println("Значение равно: " + x);
            sum += x;
        }

        System.out.println("Сумма равна: " + sum);
    }
}
