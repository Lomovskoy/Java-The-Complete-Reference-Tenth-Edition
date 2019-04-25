package chapter5;

/**
 * Программа демонстрирующая,
 * применение оператора contine с меткой.
 *
 * @author Ломовской К.Ю.
 * @since 25.04.2019
 */
public class ContinueLabel {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i){
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
