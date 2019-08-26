package chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Класс демонстрирующий применение
 * класса Iterator().
 *
 * @author Ломовской К.Ю.
 * @since 26.08.2019
 */
class IteratorDemo {

    public static void main(String[] args) {

        // Создать списочный массив
        ArrayList<String> al = new ArrayList<>();

        // Заполнить списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Использовать итератор для вывода содержимого
        System.out.println("Исходное содержимое списочного массива al: ");

        Iterator<String> itr = al.iterator();

        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Видоизменить перебираемые объекты
        ListIterator<String> lItr = al.listIterator();

        while (lItr.hasNext()){
            String element = lItr.next();
            lItr.set(element + "+");
        }

        System.out.println("Изменённое содержимое списочного массива al: ");

        itr = al.iterator();

        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // А теперь отобразим списовв обратном порядке
        System.out.println("Изменённый в обратном порядке список: ");
        while (lItr.hasPrevious()){
            String element = lItr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
