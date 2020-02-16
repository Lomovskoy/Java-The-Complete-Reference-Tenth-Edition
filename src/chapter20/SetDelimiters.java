package chapter20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Класс демонстрирующий использование класса Scanner
 * для вычисления списка чисел, разделяемых запятыми.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class SetDelimiters {

    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        // Вывести данные в файл
        FileWriter fileWriter = new FileWriter("test3.txt");

        // Теперь сохранить данные в списке,
        // разделив их запятыми
        fileWriter.write("2, 3,4, 5,6, 7,4, 9,1, 10,5, готово");
        fileWriter.close();
        FileReader fileReader = new FileReader("test3.txt");
        Scanner scanner = new Scanner(fileReader);

        // Установить в качестве рзделителей запятые и пробулы
        scanner.useDelimiter(", *");

        // Читать и суммировать числовые значения
        while (scanner.hasNext()){
            if (scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count++;
            } else {
                String str = scanner.next();
                if (str.equals("готово")) break;
                else {
                    System.out.println("Ошибка формата файла.");
                    return;
                }
            }
        }

        scanner.close();
        System.out.println("Среднее равно " + sum / count);
    }
}
