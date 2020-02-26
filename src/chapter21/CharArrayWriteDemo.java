package chapter21;

import java.io.*;

/**
 * Класс демонстрирующий использование
 * класса CharArrayWrite.
 *
 * @author Ломовской К.Ю.
 * @since 26.02.2020
 */
public class CharArrayWriteDemo {

    public static void main(String[] args) {

        CharArrayWriter f = new CharArrayWriter();
        String s = "Эти данные должны быть выведенны в массив";
        char[] buf = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        }catch (IOException e){
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки:");
        System.out.println(f.toString());

        System.out.println("В массив:");
        char[] c = f.toCharArray();

        for (char value : c)
            System.out.print(value);

        System.out.println("\nВ поток вывода типа FileWriter():");
        // Использовать оператор try с ресурсами для управления
        // потоком ввода-вывода данных в файл
        try (FileWriter f2 = new FileWriter("test5.txt")){
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