package chapter21.sequenceinputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * Класс демонстрирующий организацию последовательного ввода.
 * В этой программе используется традиционный способ закрытия файла.
 *
 * @author Ломовской К.Ю.
 * @since 23.02.2020
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) {
        int c;

        Vector<String> files = new Vector<>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while ((c = input.read()) != -1)
                System.out.println((char) c);
        } catch (NullPointerException e){
            System.out.println("Ошибка открытия файла");
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e);
        }finally {
            try {
                input.close();
            }catch (IOException e){
                System.out.println("Ошибказакрытия потока ввода SequenceInputStream");
            }
        }
    }
}
