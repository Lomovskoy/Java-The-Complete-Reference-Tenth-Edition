package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется
 * простой пример сопоставление с шаблоном.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr {

    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();              // Проверить на совпадение

        System.out.println("Проверка совпадений Java с Java: ");
        if (found)
            System.out.println("Совпадает");
        else
            System.out.println("Не совпадает");

        System.out.println();

        mat = pat.matcher("Java 9");   // Создать новый сопоставитель с шаблоном
        found = mat.matches();              // Проверить на совпадение

        System.out.println("Проверка совпадений Java с Java 9: ");
        if (found)
            System.out.println("Совпадает");
        else
            System.out.println("Не совпадает");

    }
}
