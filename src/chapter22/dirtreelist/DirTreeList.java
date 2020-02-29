package chapter22.dirtreelist;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Класс демонстрирующий применение метода
 * walkFileTree() для вывода дерева каталогов.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class DirTreeList {

    public static void main(String[] args) {

        String dirName = "src" + File.separator;

        System.out.println("Дерево каталогов, начиная с каталога " + dirName + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
