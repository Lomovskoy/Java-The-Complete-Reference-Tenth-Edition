package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется
 * применение метасимвола и квантора.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr5 {

    public static void main(String[] args) {

        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find()){
            System.out.println("Совпадение: " + mat.group());
        }

    }
}
