package chapter19;

import java.util.ArrayList;

/**
 * Класс демонстрирующий применение
 * цикла For в стиле ForEach для
 * перебора элементов коллекции.
 *
 * @author Ломовской К.Ю.
 * @since 26.08.2019
 */
class ForEachDemo {

    public static void main(String[] args) {

        // Создать списочный массив для целых чисел
        ArrayList<Integer> vals = new ArrayList<>();

        // Заполнения числами
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // Организовать цикл для вывода числовых значений
        System.out.println("Исходное содержимое списочного массива vals: ");

        for (int v: vals)
            System.out.print(v + " ");

        System.out.println();

        // Суммировать числовые значения в цикле for
        int sum = 0;

        for (int v: vals)
            sum += v;

        System.out.println("Сумма числовы значений: " + sum);
    }
}
