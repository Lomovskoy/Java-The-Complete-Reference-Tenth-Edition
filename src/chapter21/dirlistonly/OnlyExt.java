package chapter21.dirlistonly;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Класс демонстрирующий использование
 * интерфейса FilenameFilter.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class OnlyExt implements FilenameFilter {

    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
