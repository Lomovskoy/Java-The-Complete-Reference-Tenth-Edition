package chapter5;

/**
 * Программа демонстрирующая,
 * что циклы могут быть влоденными.
 *
 * @author Ломовской К.Ю.
 * @since 13.04.2019
 */
public class Nasted {

    public static void main(String[] args) {

        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
