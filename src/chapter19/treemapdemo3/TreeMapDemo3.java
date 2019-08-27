package chapter19.treemapdemo3;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Класс демонстрирующий применение
 * составного компаратора для сортировки
 * счетов по фамилиям вкладчиков.
 *
 * @author Ломовской К.Ю.
 * @since 27.08.2019
 */
class TreeMapDemo3 {

    public static void main(String[] args) {

        // Использовать метод thenComparing для создания
        // составного компаратора сравнивающего фамилии,
        // а затем Ф.И.О вкладчиков, если фамилии одинаковы.
        CompLastName compLN = new CompLastName();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        // Создать древовидное отображение
        //TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);
        TreeMap<String, Double> tm = new TreeMap<>(new CompLastName().thenComparing(new CompThenByFirstName()));

        // Ввести элементы в древовидное отображение
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Ральф Смит", -19.08);

        // Получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Вывести множество записей
        for (Map.Entry<String, Double> me: set)
            System.out.println(me.getKey() + ": " + me.getValue());

        System.out.println();

        // Внести сумму 1000 на счет Ральфа Смита
        double balance = tm.get("Ральф Смит");
        tm.put("Ральф Смит", balance + 1000);
        System.out.println("Новый остаток на счёте Ральфа Смита: " + tm.get("Ральф Смит"));
    }
}
