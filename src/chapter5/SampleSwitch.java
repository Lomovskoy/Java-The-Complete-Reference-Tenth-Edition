package chapter5;

/**
 * Программа демонстрирующая,
 * простой пример оператоа Switch.
 *
 * @author Ломовской К.Ю.
 * @since 11.04.2019
 */
public class SampleSwitch {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равно нулю.");
                    break;
                case 1:
                    System.out.println("i равно одному.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3:
                    System.out.println("i равно трём.");
                    break;
                default:
                    System.out.println("i больше трёх.");
            }

        }
    }
}