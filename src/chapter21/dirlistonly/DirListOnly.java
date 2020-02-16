package chapter21.dirlistonly;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Класс демонстрирующий использование интерфейса
 * FilenameFilter для просмотра HTML каталогов.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class DirListOnly {

    public static void main(String[] args) {

        String dirName = "C:/Program Files/Java/jdk-11.0.5/";
        File f1 = new File(dirName);
        FilenameFilter only = new OnlyExt("html");
        String[] str = f1.list(only);

        for (String s: str){
            System.out.println(s);
        }
    }
}
