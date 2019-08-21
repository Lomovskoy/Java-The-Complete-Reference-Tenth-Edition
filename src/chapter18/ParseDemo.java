package chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс демонстрирующий суммирование
 * ряда целых чисел, вводимых пользователем.
 * Она преобразует строковое представление
 * каждого числа в целое значение методом parseInt().
 *
 * @author Ломовской К.Ю.
 * @since 21.08.2019
 */
class ParseDemo {

    public static void main(String[] args) throws IOException {

        // Создать буферизированный поток чтения
        // типа BufferedReader, используя стандартный
        // поток ввода System.in.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int i;
        int sum = 0;
        System.out.println("Введите чило, 0 - для выхода.");

        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            }catch (NumberFormatException e){
                System.out.println("Неверный формат");
                i = 0;
            }
            sum += i;
            System.out.println("Текущая сумма: " + sum);
        }while (i != 0);
        
    }
}
