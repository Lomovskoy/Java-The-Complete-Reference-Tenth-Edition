package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется
 * применение класса символов.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr7 {

    public static void main(String[] args) {

        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while (mat.find()){
            System.out.println("Совпадение: " + mat.group());
        }
    }
}
