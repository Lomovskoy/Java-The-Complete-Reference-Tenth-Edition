package chapter29.streamdemo6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется применение
 * метода collect() для создания списка типа
 * List() и множества типа Set() из потока данных.
 *
 * @author Ломовской К.Ю.
 * @since 24.03.2020
 */
public class StreamDemo6 {

    public static void main(String[] args) {

        // Список имён, номеров телефонов и адресов электронной почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "larry@hearbshild.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "james@hearbshild.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "mary@hearbshild.com"));

        // Отобразить на новый поток данных
        // только имена и номера телефонгов
        Stream<NamePhone> nameAndPhone = myList.stream().map((a)->
                new NamePhone(a.name, a.phoneNum)
        );

        // вызвать метод collect(), что бы составить
        // список типа List из имён и номеров телефонов
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Список имён и номеров телефонов в списке типа List: ");
        npList.forEach((a)->
                System.out.println(a.name + ": " + a.phoneNum)
        );
        System.out.println();

        // Получить новый поток для отображения
        nameAndPhone = myList.stream().map((a)->
                new NamePhone(a.name, a.phoneNum)
        );

        // вызвать метод collect(), что бы составить
        // список типа Set из имён и номеров телефонов
        List<NamePhone> npSet = nameAndPhone.collect(Collectors.toList());
        System.out.println("Список имён и номеров телефонов в списке типа Set: ");
        npSet.forEach((a)->
                System.out.println(a.name + ": " + a.phoneNum)
        );

        // Получить новый поток для отображения
        nameAndPhone = myList.stream().map((a)->
                new NamePhone(a.name, a.phoneNum)
        );

        // Другие способы преобразования stream в солекции
        LinkedList<NamePhone> npLinkList = nameAndPhone.collect(()->
                new LinkedList<>(),
                (list, element)-> list.add(element),
                (listA, listB)-> listA.addAll(listB)
        );

        // Получить новый поток для отображения
        nameAndPhone = myList.stream().map((a)->
                new NamePhone(a.name, a.phoneNum)
        );

        HashSet<NamePhone> npHashSet = nameAndPhone.collect(
                HashSet::new,
                HashSet::add,
                HashSet::addAll
        );
        System.out.println();
    }
}
