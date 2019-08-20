package chapter17;

/**
 * Класс демонстрирующий использование
 * метода reverse().
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class ReverseDemo {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("abcdef");

        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
