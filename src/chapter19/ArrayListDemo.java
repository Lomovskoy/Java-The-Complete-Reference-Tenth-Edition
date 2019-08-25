package chapter19;

import java.util.ArrayList;

/**
 * Класс демонстрирующий применение
 * класса ArrayList().
 *
 * @author Ломовской К.Ю.
 * @since 25.08.2019
 */
class ArrayListDemo {

    public static void main(String[] args) {

        // Создать списочный массив
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер списочного массива al: " + al.size());

        // Ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");

        System.out.println("Размер списочного массива al после ввода элементов: " + al.size());

        // Вывести списочный массив
        System.out.println("Содержимое списочного массива al: " + al);

        // Удалить элементы из списочного массива
        al.remove("F");
        al.remove(2);

        // Размер списочного массива после удаления элементов
        System.out.println("Размер списочного массива al после удаления элементов: " + al.size());
        System.out.println("Содержимое списочного массива al после удаления элементов: " + al);
    }

}
