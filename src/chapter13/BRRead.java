package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Программа демонстрирующая, использование класс
 * BufferedReader для чтения символов с консоли.
 *
 * @author Ломовской К.Ю.
 * @since 18.06.2019
 */
public class BRRead {

    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода.");
        // Читать символы.
        do {
            c = (char) br.read();
            System.out.print(c);
        }while (c != 'q');
    }
}
