package chapter5;

/**
 * Программа демонстрирующая,
 * применение оператора break для выхода из цикла while.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
public class BreakLoop2 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 100){
            if (i == 10) break; // Выйти из цикла, если значение переменной i равно 10
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл завершён.");
    }
}
