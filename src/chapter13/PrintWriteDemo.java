package chapter13;

import java.io.PrintWriter;

/**
 * Программа демонстрирующая,
 * использование класса PrintWriter.
 *
 * @author Ломовской К.Ю.
 * @since 18.06.2019
 */
class PrintWriteDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Это строка");
        int i = -7;

        pw.println(i);
        double d = 4.5-7;
        pw.println(d);
    }
}
