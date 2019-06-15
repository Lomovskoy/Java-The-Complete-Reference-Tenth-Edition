package chapter12;

/**
 * Программа демонстрирующая, автоупаковку и автораспаковку
 * значений из классов Boolean и Character.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
public class AutoBox5 {

    public static void main(String[] args) {

        Boolean b = true;

        if (b)
            System.out.println("b равно true");

        Character ch = 'x';
        char ch2 = ch;

        System.out.println("ch2 равно " + ch2);
    }
}
