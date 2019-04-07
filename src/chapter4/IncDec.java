package chapter4;

/**
 * Программа демонстрирующая,
 * применение операций инкремента и декримента.
 *
 * @author Ломовской К.Ю.
 * @since 07.04.2019
 */
public class IncDec {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;
        c++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
