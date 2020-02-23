package chapter21.sequenceinputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Класс демонстрирующий организацию последовательного ввода.
 * В этой программе используется традиционный способ закрытия файла.
 *
 * @author Ломовской К.Ю.
 * @since 23.02.2020
 */
public class InputStreamEnumerator implements Enumeration<FileInputStream> {

    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files){
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        }catch (IOException e){
            return null;
        }
    }
}
