package chapter5;

/**
 * Программа содержит ошибку.
 *
 * @author Ломовской К.Ю.
 * @since 25.04.2019
 */
public class BreakErr {

    public static void main(String[] args) {

        one: for (int i = 0; i < 3; i++){
            System.out.println("Проход " + i + ": ");
        }

        for (int j = 0; j < 100; j++){
            if (j == 10) break one; // Ошибка!
            System.out.println(j + " ");
        }
    }
}
