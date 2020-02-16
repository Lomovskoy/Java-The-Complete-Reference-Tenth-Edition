package chapter20;

import java.util.Scanner;

/**
 * Класс демонстрирующий использование метода
 * findInLineDemo из класса Scanner.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class FindInLineDemo {

    public static void main(String[] args) {

        String instr = "Имя: Том Возраст: 28 ID 77";
        Scanner scanner = new Scanner(instr);

        // Найти поле возраста и вывести его содержимое
        scanner.findInLine("Возраст:");

        if (scanner.hasNext())
            System.out.println(scanner.next());
        else
            System.out.println("Ошибка!");
    }
}
