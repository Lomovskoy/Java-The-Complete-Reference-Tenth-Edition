package chapter22;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Класс демонстрирующий потоковый
 * ввод на основе NIO.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class NIOStreamWrite {

    public static void main(String[] args) {

        // Открть файл и получить связанный с ним поток ввода
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test10.txt")))){

            // Вывести в поток заданные заданные количество байтов
            for (int i = 0; i < 26; i++)
                fout.write((byte) ('A' + i));

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
