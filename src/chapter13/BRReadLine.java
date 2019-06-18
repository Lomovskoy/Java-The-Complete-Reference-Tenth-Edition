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
class BRReadLine {

    public static void main(String[] args) throws IOException {
        // Создать поток ввода типа BufferedReader,
        // используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Введите строки текста");
        System.out.println("Введите 'стоп' для завершения.");

        do {
            str =  br.readLine();
            System.out.println(str);
        }while (!str.equals("стоп"));
    }
}
