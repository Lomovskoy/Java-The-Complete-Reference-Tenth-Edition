package chapter5;

/**
 * Программа демонстрирующая,
 * применение оператора contine.
 *
 * @author Ломовской К.Ю.
 * @since 25.04.2019
 */
public class Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
            if (i % 2 == 0)continue;
            System.out.println();
        }
    }
}
