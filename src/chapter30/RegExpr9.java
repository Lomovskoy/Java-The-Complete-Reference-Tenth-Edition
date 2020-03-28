package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В этой программе демонстрируется
 * применение метода split().
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class RegExpr9 {

    public static void main(String[] args) {

        // Составить шабон для сопоставления со словами,
        // набранными строчными буквами
        Pattern pat = Pattern.compile("[ ,.!]");
        String[] strs = pat.split("one two,alpha9 12!done.");

        for (String str : strs)
            System.out.println("Следующая лксема: " + str);
    }
}
