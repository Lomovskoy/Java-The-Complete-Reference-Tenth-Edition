package chapter7;

/**
 * Программа демонстрирующая,
 * применение массива символьных строк.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
public class SpringDemo3 {

    public static void main(String[] args) {

        String str[] = {"один", "два", "три"};

        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]: " + str[i]);
    }
}
