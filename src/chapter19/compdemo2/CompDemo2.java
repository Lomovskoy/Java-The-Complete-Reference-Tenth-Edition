package chapter19.compdemo2;

import java.util.TreeSet;

/**
 * Класс демонстрирующий применение
 * специального компаратора.
 *
 * @author Ломовской К.Ю.
 * @since 27.08.2019
 */
class CompDemo2 {

    public static void main(String[] args) {

        // Создаём древовидное множество
        TreeSet<String> ts = new TreeSet<String>(new MyComp().reversed());

        // Ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Вывести элементы из древовидного множества
        for (String element: ts)
            System.out.print(element + " ");
        
        System.out.println();
    }
}
