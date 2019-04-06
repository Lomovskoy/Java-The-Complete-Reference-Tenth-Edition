package chapter3;

/**
 * Демонстрация работы с переменной типа bool.
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
public class BoolTest {

    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        // Занчение типа boolean может управлять оператором if.
        if (b) System.out.println("Этот код выполнится.");
        b = false;
        if (b) System.out.println("Этот код не выполнится.");

        // Резальтат сравнения даёт значение типа boolean.
        System.out.println("10 < 9 равно " + (10 < 9));
    }
}
