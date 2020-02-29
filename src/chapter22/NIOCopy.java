package chapter22;

import java.io.IOException;
import java.nio.file.*;

/**
 * Класс демонстрирующий копирование файла
 * средствами системы ввода-вывода NIO.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class NIOCopy {

    public static void main(String[] args) {

        if (args.length != 2){
            System.out.println("Применение: откуда и куда копировать");
            return;
        }

        try {
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[0]);

            // Скопировать файл
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
