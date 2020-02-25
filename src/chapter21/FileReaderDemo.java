package chapter21;

import java.io.FileReader;
import java.io.IOException;

/**
 * Класс демонстрирующий использование
 * класса FileReader.
 *
 * @author Ломовской К.Ю.
 * @since 25.02.2020
 */
public class FileReaderDemo {

    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("FileReaderDemo.java")){
            int c;

            // Прочитатб и вывести содержимое файла
            while ((c = fileReader.read()) != -1)
                System.out.println((char) c);
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
