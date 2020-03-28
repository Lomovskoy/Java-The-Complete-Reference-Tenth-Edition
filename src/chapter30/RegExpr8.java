package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется
 * применение метода replaceAll().
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr8 {

    public static void main(String[] args) {

        String str = "Jon Jonathan Frank Ken Todd";
        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);

        System.out.println("Исходная последовательность: " + str);
        str = mat.replaceAll("Eric ");

        System.out.println("Изменённая последовательтность: " + str);
    }
}
