package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется использования метода
 * find() для нахождения подпоследовательности символов.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr2 {

    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java 9");

        System.out.println("Поиск последовательности Java в Java 9: ");

        if (mat.find())
            System.out.println("Подпоследовательность найдена.");
        else
            System.out.println("Подпоследовательность не найдена.");

    }
}
