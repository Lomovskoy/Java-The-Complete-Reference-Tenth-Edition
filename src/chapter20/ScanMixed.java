package chapter20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Класс демонстрирующий использование класса
 * Scanner для чтения разнотипных типов данных.
 *
 * @author Ломовской К.Ю.
 * @since 12.02.2020
 */
public class ScanMixed {

    public static void main(String[] args) throws IOException {

        int i;
        double d;
        boolean b;
        String s;

        // ввести данные в файл
        FileWriter fileWriter = new FileWriter("test2.txt");
        fileWriter.write("Тестирование Scanner 10 12,2 один true два false");
        fileWriter.close();

        FileReader fileReader = new FileReader("test2.txt");
        Scanner scanner = new Scanner(fileReader);

        // Читать данные до конца файла
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                i = scanner.nextInt();
                System.out.println("int: " + i);
            } else if (scanner.hasNextDouble()){
                d = scanner.nextDouble();
                System.out.println("double: " + d);
            } else if (scanner.hasNextBoolean()){
                b = scanner.nextBoolean();
                System.out.println("boolean: " + b);
            } else {
                s = scanner.next();
                System.out.println("String: " + s);
            }
        }

        scanner.close();
    }
}
