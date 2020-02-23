package chapter21;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Класс демонстрирующий использование
 * класса ByteArrayOutputStreamReset.
 *
 * @author Ломовской К.Ю.
 * @since 23.02.2020
 */
public class ByteArrayOutputStreamReset {

    public static void main(String[] args) {

        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть выведенны в массив";
        byte[] buf = s.getBytes();

        try {
            f.write(buf);
        }catch (IOException e){
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки:");
        System.out.println(f.toString());

        System.out.println("В массив:");
        byte[] b = f.toByteArray();

        for (byte value : b)
            System.out.print((char) value);

        System.out.println("\nВ поток вывода типа OutputStream():");
        // Использовать оператор try с ресурсами для управления
        // потоком ввода-вывода данных в файл
        try (FileOutputStream f2 = new FileOutputStream("test3.txt")){
            f.writeTo(f2);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
            return;
        }

        System.out.println("Установка в исходное состояние");
        f.reset();

        for (int i = 0; i < 3; i++)
            f.write('X');

        System.out.println(f.toString());
    }
}