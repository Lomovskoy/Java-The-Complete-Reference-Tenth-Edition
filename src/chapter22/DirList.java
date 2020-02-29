package chapter22;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Класс демонстрирующий получение
 * и вывод содержимого каталога.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class DirList {

    public static void main(String[] args) {

        String dirName = "src" + File.separator;

        // Получить и обработать поток ввода
        // в блоке оператора try с ресурсами
        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(dirName))) {
            System.out.println("Каталог " + dirName);

            // Класс DirectoryStream реализует интерфейс Iterable,
            // поэтому для вывода содержимого каталога можно
            // организовать цикл for в цикле for each
            for (Path entry: dirStream){
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("      ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirName + " - не является каталогом " + e);
        }catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
