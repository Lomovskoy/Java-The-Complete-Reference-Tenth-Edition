package chapter21;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Класс демонстрирующий использование
 * класса FileInputOutputDemo, с традиционным
 * методом закрытия файла.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class FileInputOutputDemo {

    public static void main(String[] args) {

        String sourse = "Now is the for all good men\n " +
                "to come to the aid of their country\n " +
                "and ply their due taxes.";

        byte[] buf = sourse.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");

            // Записать данные в первый файл
            for (int i = 0; i < buf.length; i += 2)
                f0.write(buf[i]);

            // Записать данные во второй файл
            f1.write(buf);

            // Записать данные в третий файл
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException e){
            System.out.println("Произошла ошибка ввода вывода");
        } finally {
            try {
                if (f0 != null) f0.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file1.txt");
            }

            try {
                if (f1 != null) f1.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file3.txt");
            }

            try {
                if (f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file1.txt");
            }
        }
    }
}
