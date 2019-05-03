package chapter5;

/**
 * Программа демонстрирующая, что
 * переменная в цыкле for each доступна только длячтения.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
class NoChange {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Использовать цикл for в стиле for each дляч вывода
        // и суммирвоания значений
        for (int x: nums){
            System.out.print(x + " ");
            x *= 10; // Этот оператор никак не повлияет на массив nums
        }

        System.out.println();

        for (int x: nums)
            System.out.print(x + " ");

        System.out.println();
    }
}
