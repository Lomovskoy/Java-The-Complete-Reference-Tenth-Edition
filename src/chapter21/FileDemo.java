package chapter21;

import java.io.File;

/**
 * Класс демонстрирующий использование
 * некоторых методов из класса File.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class FileDemo {

    static void print(String string){
        System.out.println(string);
    }

    public static void main(String[] args) {

        File f1 = new File("C:/Program Files/Java/jdk-11.0.5/COPYRIGHT");
        print("Имя файла: " + f1.getName());
        print("Путь: " + f1.getPath());
        print("Абсолютный путь: " + f1.getAbsolutePath());
        print("Родительский каталог: " + f1.getParent());
        print(f1.exists() ? "существует" : "не сцществует");
        print(f1.canWrite() ? "доступен для записи" : "не доступен для записи");
        print(f1.canRead() ? "доступен для чтения" : "не доступен для чтения");
        print(f1.isDirectory() ? "является каталогом" : "не является каталогом");
        print(f1.isFile() ? "является файлом" : "не является файлом");
        print(f1.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        print("Последние изменения в файле: " + f1.lastModified());
        print("Размер: " + f1.length() + " байт");
    }
}
