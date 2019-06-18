package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Программа демонстрирующая,
 * простейший текстовый редактор.
 *
 * @author Ломовской К.Ю.
 * @since 18.06.2019
 */
class TinyEdit {

    public static void main(String[] args) throws IOException {
        // Создать поток ввода типа BufferedReader,
        // используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Введите строки текста.");
        System.out.println("Ведите 'стоп' для завершения.");

        for (int i = 0; i < 100; i++){
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
        }

        System.out.println("\nСодержание вашего файла:");
        // Вывексти тестовые строки
        for (int i = 0; i < 100; i++){
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
