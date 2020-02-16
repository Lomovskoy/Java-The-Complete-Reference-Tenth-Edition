package chapter21;

import java.io.File;

/**
 * Класс демонстрирующий использование
 * каталогов.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class DirList {

    public static void main(String[] args) {

        String dirName = "C:/Program Files/Java/jdk-11.0.5/";
        File f1 = new File(dirName);

        if (f1.isDirectory()){
            System.out.println("Каталог " + dirName);
            String[] sArr = f1.list();

            for (String s: sArr){
                File file = new File(dirName + "/" + s);
                if (file.isDirectory()){
                    System.out.println(s + " Является каталогом");
                } else {
                    System.out.println(s + " Является файлом");
                }
            }
        } else {
            System.out.println("Не является каталогом");
        }
    }
}
