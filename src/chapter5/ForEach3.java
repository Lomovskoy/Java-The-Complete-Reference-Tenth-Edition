package chapter5;

/**
 * Программа демонстрирующая,
 * применение цикла for для обращения к двумерному массиву.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
public class ForEach3 {

    public static void main(String[] args) {

        int nums[][] = new int[3][5];
        int sum = 0;

        // присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        // Использовать цикл for в стиле for each для
        // вывода и суммирвоания значений
        for (int x[]: nums){
            for (int y: x){
                System.out.println("Значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
