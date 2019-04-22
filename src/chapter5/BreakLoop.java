package chapter5;

/**
 * Программа демонстрирующая,
 * применение оператора break для выхода из цимкла.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
public class BreakLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++){
            if (i == 10) break; // Выйти из цикла, если значение переменной i равно 10
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завуершён.");
    }
}
