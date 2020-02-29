package chapter22;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Класс демонстрирующий получение только тех
 * файлов из каталогов, что доступны для записи.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class DirList2 {

    public static void main(String[] args) {

        String dirName = "src" + File.separator + "chapter22" + File.separator;

        // Создать фильтр, возырвщвющий логическое значение true
        // только в отношении доступных для записи файлов
        DirectoryStream.Filter<Path> how = Files::isWritable;

        // Получить и обработать поток ввода из каталога
        // только доступных для чтения файлов
        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(dirName), how)) {
            System.out.println("Каталог: " + dirName);

            // Класс DirectoryStream реализует интерфейс Iterable,
            // поэтому для вывода содержимого каталога можно
            // организовать цикл for в цикле for each
            for (Path entry: dirStream){
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("      ");

                System.out.println(entry.getFileName());
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
