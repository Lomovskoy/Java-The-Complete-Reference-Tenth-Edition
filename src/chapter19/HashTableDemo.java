package chapter19;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Класс демонстрирующий применение
 * класса HashTable.
 *
 * @author Ломовской К.Ю.
 * @since 08.02.2020
 */
public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        Double bal;

        balance.put("Джон Сноу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Джейн Бейкер", 1378.00);
        balance.put("Тод Холл", 99.22);
        balance.put("Ральф Смит", -19.08);

        // Показать все счета в хеш таблице
        names = balance.keys();
        while (names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Внести сумму 1000 на счёт Джона Сноу
        bal = balance.get("Джон Сноу");
        balance.put("Джон Сноу", bal + 1000);
        System.out.println("Новый остаток на счёте Джона Сноу: " + balance.get("Джон Сноу"));
    }
}
