package chapter19;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Класс демонстрирующий применение
 * итераторов в месте с классом HashTable.
 *
 * @author Ломовской К.Ю.
 * @since 08.02.2020
 */
public class HashTableDemo2 {

    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable<>();

        String str;
        Double bal;

        balance.put("Джон Сноу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Джейн Бейкер", 1378.00);
        balance.put("Тод Холл", 99.22);
        balance.put("Ральф Смит", -19.08);

        // Показать все счета в хеш таблице. Снчала получить
        // представлние всех ключей в виде множества
        Set<String> setKey = balance.keySet();

        // Получить Итератор
        Iterator<String> iter = setKey.iterator();

        while (iter.hasNext()) {
            str = iter.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Внести сумму 1000 на счёт Джона Сноу
        bal = balance.get("Джон Сноу");
        balance.put("Джон Сноу", bal + 1000);
        System.out.println("Новый остаток на счёте Джона Сноу: " + balance.get("Джон Сноу"));
    }
}
