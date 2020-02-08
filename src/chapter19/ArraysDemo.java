package chapter19;

import java.util.Arrays;

/**
 * Класс демонстрирующий применение
 * некоторых методов из класса Arrays.
 *
 * @author Ломовской К.Ю.
 * @since 08.02.2020
 */
public class ArraysDemo {

    public static void main(String[] args) {

        // Выделить и инициировать массив
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;

        // Вывести, отсортировать и снова вывести
        // содержимое массива
        System.out.print("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        // Заполнить массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.println("Массив после вызова метода full()");
        display(array);

        // отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.println("Массивпослде повторной сортировки: ");
        display(array);

        // Выполнить двоичный поиск значения -9
        System.out.print("Значение -9 находится на позиции ");
        int index = Arrays.binarySearch(args, -9);
        System.out.println(index);
    }

    static void display(int[] array){
        for (int i: array)
            System.out.print(i + " ");
        System.out.println();
    }
}
