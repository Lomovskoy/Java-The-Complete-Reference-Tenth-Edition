package chapter19;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Класс демонстрирующий различные
 * операции над классом Vector.
 *
 * @author Ломовской К.Ю.
 * @since 08.02.2020
 */
public class VectorDemo {

    public static void main(String[] args) {

        // Начальный размер вектора - 3, а инкремент - 2
        Vector<Integer> vector = new Vector<>(3, 2);
        System.out.println("Начальный размер вектора: " + vector.size());
        System.out.println("Начальная ёмкость вектора: " + vector.capacity());

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        System.out.println("Ёмкость после ввода четырёх элементов: " + vector.capacity());

        vector.addElement(5);
        System.out.println("Текущая ёмкость вектора: " + vector.capacity());

        vector.addElement(6);
        vector.addElement(7);
        System.out.println("Текущая ёмкость вектора: " + vector.capacity());

        vector.addElement(9);
        vector.addElement(10);
        System.out.println("Текущая ёмкость вектора: " + vector.capacity());

        vector.addElement(11);
        vector.addElement(12);

        System.out.println("Первый элемент вектора: " + vector.firstElement());
        System.out.println("Последний элемент вектора: " + vector.lastElement());

        if (vector.contains(3))
            System.out.println("Вектор содержит 3.");

        // Перечислить все элементы
        Enumeration<Integer> vectorEnum = vector.elements();

        System.out.println("Элементы вектора");
        while (vectorEnum.hasMoreElements())
            System.out.print(vectorEnum.nextElement() + " ");
        System.out.println();

        System.out.println("Элементы вектора");
        Iterator<Integer> vectorIter = vector.iterator();
        while (vectorIter.hasNext())
            System.out.print(vectorIter.next() + " ");
        System.out.println();

        System.out.println("Элементы вектора");
        for (int element : vector)
            System.out.print(element + " ");
        System.out.println();

    }
}
