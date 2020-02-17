package chapter21;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Класс демонстрирующий использование
 * класса FileInputOutputDemo, с методом try
 * с ресурсами в качестве метода закрытия файла.
 *
 * @author Ломовской К.Ю.
 * @since 17.02.2020
 */
public class FileInputOutputDemo2 {

    public static void main(String[] args) {

        String sourse = "Now is the for all good men\n " +
                "to come to the aid of their country\n " +
                "and ply their due taxes.";

        byte[] buf = sourse.getBytes();

        // Применить оператор try с ресурсами для закрытия файла
        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
             FileOutputStream f1 = new FileOutputStream("file2.txt");
             FileOutputStream f2 = new FileOutputStream("file3.txt")){

            // Записать данные в первый файл
            for (int i = 0; i < buf.length; i += 2)
                f0.write(buf[i]);

            // Записать данные во второй файл
            f1.write(buf);

            // Записать данные в третий файл
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException e){
            System.out.println("Произошла ошибка ввода вывода");
        }
    }
}
