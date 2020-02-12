package chapter20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Класс демонстрирующий использование класса Scanner
 * для вычисление среднего из списка вводимых из файла.
 *
 * @author Ломовской К.Ю.
 * @since 12.02.2020
 */
public class AvgFile {

    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        // ввести данные в файл
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("2 3,4 5 6 7,4 9,1 10,5 готово");
        fileWriter.close();

        FileReader fileReader = new FileReader("test.txt");
        Scanner scanner = new Scanner(fileReader);

        // Читать и суммировать числовые значения
        while (scanner.hasNext()){
            if (scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count++;
            }else {
                String str = scanner.next();
                if (str.equals("готово"))
                    break;
                else {
                    System.out.println("Ошибка формата данных из файла.");
                    return;
                }
            }
        }

        scanner.close();
        System.out.println("Среднее число равно " + sum / count);
    }
}
