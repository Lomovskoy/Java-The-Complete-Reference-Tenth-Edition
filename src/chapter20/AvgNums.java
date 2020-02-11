package chapter20;

import java.util.Scanner;

/**
 * Класс демонстрирующий использование класса Scanner
 * для вычисление среднего из списка введённых числовых значений.
 *
 * @author Ломовской К.Ю.
 * @since 11.02.2020
 */
public class AvgNums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Введите числа для подсчёта среднего.");

        // Читать и сумировать числовые значения
        while (scanner.hasNext()){
            if (scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count++;
            }else {
                String str = scanner.next();
                if (str.equals("готово")) break;
                else {
                    System.out.println("Ошибка формата данных.");
                    return;
                }
            }
        }

        scanner.close();
        System.out.println("Среднее равно " + sum / count);
    }
}
