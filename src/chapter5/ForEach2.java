package chapter5;

/**
 * Программа демонстрирующая, применение оператора
 * break в цыкле for в стиле for each.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
public class ForEach2 {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Использовать цикл for в стиле for each дляч вывода
        // и суммирвоания части значений
        for (int x: nums){
            System.out.println("Значение равно: " + x);
            sum += x;
            if (x == 5) break; // Прервать цикл после получения 5 значений
        }

        System.out.println("Сумма первых пяти элементов равна: " + sum);
    }
}
