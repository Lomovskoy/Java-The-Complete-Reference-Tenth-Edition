package chapter22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Класс демонстрирующий получение
 * сведений о пути к файлу и самом файле.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class PathDemo {

    public static void main(String[] args) {

        Path filePath = Paths.get("src"+ File.separator + "chapter22" + File.separator + "PathDemo.java");

        System.out.println("Имя файла: " + filePath.getName(1));
        System.out.println("Путь к файлу: " + filePath);
        System.out.println("Абсолютный путь к файлу: " + filePath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filePath.getParent());

        if (Files.exists(filePath))
            System.out.println("Файл существует");
        else
            System.out.println("Файл не существует");

        try {
            if (Files.isHidden(filePath))
                System.out.println("Файл скрыт");
            else
                System.out.println("Файл не скрыт");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

        Files.isWritable(filePath);
        System.out.println("Файл доступен для записи");

        Files.isReadable(filePath);
        System.out.println("Файл доступен для чтения");

        try {
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);

            if (attributes.isDirectory())
                System.out.println("Это каталог");
            else
                System.out.println("Этой файл");

            if (attributes.isRegularFile())
                System.out.println("Это обычный файл");
            else
                System.out.println("Это не обычный файл");

            if (attributes.isSymbolicLink())
                System.out.println("Это символьная ссылка");
            else
                System.out.println("Это не символьная ссылка");

            System.out.println("Время последней модификации файла: " + attributes.lastModifiedTime());
            System.out.println("Размер файла: " + attributes.size() + " байт");
        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов " + e);
        }
    }
}
