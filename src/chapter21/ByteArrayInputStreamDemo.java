package chapter21;

import java.io.ByteArrayInputStream;

/**
 * Класс демонстрирующий использование
 * класса ByteArrayInputStreamDemo.
 *
 * @author Ломовской К.Ю.
 * @since 17.02.2020
 */
public class ByteArrayInputStreamDemo {

    public static void main(String[] args) {

        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
    }
}
