package chapter19;

import java.util.ArrayList;

/**
 * Класс демонстрирующий преобразование
 * списочного массива типа ArrayList в
 * обычный массив.
 *
 * @author Ломовской К.Ю.
 * @since 25.08.2019
 */
class ArrayListToArray {

    public static void main(String[] args) {

        // Создать списочный массив
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Ввести элементы в списочный массив
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        // Вывести списочный массив
        System.out.println("Содержимое списочного массива al: " + al);

        // Получить обычный массив
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        // Суммировать элементы массива
        for (int i: ia) sum += i;

        System.out.println("Сумма элементов массива: " + sum);
    }
}
