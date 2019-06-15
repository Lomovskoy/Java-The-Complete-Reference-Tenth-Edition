package chapter12;

/**
 * Программа демонстрирующая,
 * автоупаковку и автораспаковку.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
public class AutoBox {

    public static void main(String[] args) {

        // Автоупаковка значениятипа int
        Integer iOb = 100;

        // Автораспаковка значениятипа int
        int i = iOb;

        // Выведет значение 100 100
        System.out.println(i + " " + iOb);
    }
}
