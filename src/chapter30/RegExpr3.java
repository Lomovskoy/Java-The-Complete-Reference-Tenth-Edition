package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется использования метода find()
 * для нахождения нескольких подпоследовательностей символов.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr3 {

    public static void main(String[] args) {
        Pattern pat = Pattern.compile("test");
        Matcher mat = pat.matcher("test 1 2 3 test");

        while (mat.find()){
            System.out.println("Последовательность test найдена по индексу: " + mat.start());
        }

    }
}
