package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется
 * применение квантора ?.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr6 {

    public static void main(String[] args) {
        // Предоставить шаблон для несторогого совпадения
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find()){
            System.out.println("Совпадение: " + mat.group());
        }

    }
}
