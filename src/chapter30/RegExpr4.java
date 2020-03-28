package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется
 * применение квантора.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr4 {

    public static void main(String[] args) {

        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW");

        while (mat.find()){
            System.out.println("Совпадение: " + mat.group());
        }

    }
}
