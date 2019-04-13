package chapter5;

/**
 * Программа демонстрирующая,
 * обьявление переменной в нутри цикла for.
 *
 * @author Ломовской К.Ю.
 * @since 13.04.2019
 */
public class ForTick2 {

    public static void main(String[] args) {

        // Здесь переменная n объявляется в самом цткле for
        for (int n = 10; n > 0; n--)
            System.out.println("такт " + n);
    }
}
