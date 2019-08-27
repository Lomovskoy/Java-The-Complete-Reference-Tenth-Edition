package chapter19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Класс демонстрирующий применение
 * класса HashMap.
 *
 * @author Ломовской К.Ю.
 * @since 27.08.2019
 */
class HashMapDemo {

    public static void main(String[] args) {

        // Создать хеш-отображение
        HashMap<String, Double> hm = new HashMap<>();

        // Ввести элементы в хеш-отображение
        hm.put("Джон Доу", 3434.34);
        hm.put("Том Смит", 123.22);
        hm.put("Джейн Бейкер", 1378.00);
        hm.put("Тод Холл", 99.22);
        hm.put("Ральф Смит", -19.08);

        // Получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // Вывести множество записей
        for (Map.Entry<String, Double> me: set)
            System.out.println(me.getKey() + ": " + me.getValue());

        System.out.println();

        // Внести сумму 1000 на счет Ральфа Смита
        double balance = hm.get("Ральф Смит");
        hm.put("Ральф Смит", balance + 1000);
        System.out.println("Новый остаток на счёте Ральфа Смита: " + hm.get("Ральф Смит"));
    }
}
