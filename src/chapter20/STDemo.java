package chapter20;

import java.util.StringTokenizer;

/**
 * Класс демонстрирующий применение
 * класса StringTokenizer.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class STDemo {

    static String in = "Название=Java. Полное руководство; " +
                        "Автор=Шилд; " +
                        "Издательство=Oracle Press; " +
                        "Авторское право=2018";

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer(in, "=;");

        while (st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
