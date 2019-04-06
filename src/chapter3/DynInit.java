package chapter3;

/**
 * Программа демонстрирующая,
 * динамическую инициацию переменных.
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
public class DynInit {

    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // Динамическая инициация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
