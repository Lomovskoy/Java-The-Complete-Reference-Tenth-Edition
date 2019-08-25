package chapter19;

import java.util.LinkedList;

/**
 * Класс демонстрирующий применение
 * класса LinkedList().
 *
 * @author Ломовской К.Ю.
 * @since 25.08.2019
 */
class LinkedListDemo {

    public static void main(String[] args) {

        // Создать связанный список
        LinkedList<String> ll = new LinkedList<String>();

        // Ввести элементы в списочный массив
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.add("F");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Исходное содержание связанного списка ll: " + ll);

        // Удалить указанные элементы из связанного списка
        ll.remove("F");
        ll.remove(2);

        System.out.println("Содержимое связанного списка ll после удаления элементов: " + ll);

        // Удалить первый и последний элемент из связанного списка
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое связанного списка ll после удаления первого и последнего элементов: " + ll);

        // Получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержание изменённого связанного списка ll: " + ll);
    }

}
