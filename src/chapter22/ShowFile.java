package chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Эта программа выводит текстовый файл, используя код
 * потокового ввода-вывада на основе системы NIO.
 *
 * Что бы воспользоваться этой программой, укажите имя
 * файла, который требуется посмотреть. Например, чтобы
 * посмотреть файл test.txt, введите в режиме командной
 * строки следующую команду:
 *
 * java ShowFile test.txt
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class ShowFile {

    public static void main(String[] args) {
        int i;

        // Сначала удостоверимся, что указывается имя файла
        if (args.length != 1){
            System.out.println("Применение: ShowFile имя_файла");
            return;
        }

        // Открыть файл и получить связанный с ним поток ввода-вывода
        try (InputStream fin = Files.newInputStream(Paths.get(args[0]))){

            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
