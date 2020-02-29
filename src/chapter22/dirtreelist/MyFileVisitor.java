package chapter22.dirtreelist;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Класс демонстрирующий специальную версию класса
 * SimpleFileVisitor в которой переопределяется
 * метод visitFile()
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class MyFileVisitor extends SimpleFileVisitor<Path> {

    private static int i = 0;

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) {
        System.out.println(++i + ": " + path);
        return FileVisitResult.CONTINUE;
    }
}
