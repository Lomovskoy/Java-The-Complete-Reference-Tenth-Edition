package chapter12;

/**
 * Программа демонстрирующая,
 * оболочки числового типа.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
public class Wrap {

    public static void main(String[] args) {

        Integer iOb = Integer.valueOf(100);

        int i = iOb.intValue();

        // Выведет значение 100 100
        System.out.println(i + " " + iOb);
    }
}
