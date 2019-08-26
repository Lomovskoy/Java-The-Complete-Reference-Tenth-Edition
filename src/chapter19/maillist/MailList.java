package chapter19.maillist;

import java.util.LinkedList;

/**
 * Класс демонстрирующий пример
 * обработки спискапочтовых адресов.
 *
 * @author Ломовской К.Ю.
 * @since 26.08.2019
 */
class MailList {

    public static void main(String[] args) {

        LinkedList<Addres> ml = new LinkedList<>();

        // Ввести элементы в связанный список
        ml.add(new Addres("J. W. Wesy", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Addres("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Addres("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        // Вывести список поччтовых адресов
        for (Addres element: ml)
            System.out.println(element + "\n");

        System.out.println();
    }
}
