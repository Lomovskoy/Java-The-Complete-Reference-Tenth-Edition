package chapter29.streamdemo5;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется применение
 * метода map() для создания нового потока данных,
 * содержащего толькго избранные элементы из исходного списка.
 *
 * @author Ломовской К.Ю.
 * @since 24.03.2020
 */
public class StreamDemo5 {

    public static void main(String[] args) {

        // Список имён, номеров телефонов и адресов электронной почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "larry@hearbshild.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "james@hearbshild.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "mary@hearbshild.com"));

        System.out.println("Исходные элементы из спика myList: ");
        myList.forEach((a)->
                        System.out.println(a.name + " " + a.phoneNum + " " + a.email)
        );
        System.out.println();

        // Отобразить на новый поток данных
        // только имена и номера телефонгов
        Stream<NamePhone> nameAndPhone = myList.stream().map((a)->
                new NamePhone(a.name, a.phoneNum)
        );
        System.out.println("Список имён и номеров телефонов: ");
        nameAndPhone.forEach((a)->
                System.out.println(a.name + " " + a.phoneNum)
        );
    }
}
