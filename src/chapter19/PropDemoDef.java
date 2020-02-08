package chapter19;

import java.util.Properties;
import java.util.Set;

/**
 * Класс демонстрирующий применение
 * списка свойств по умолчанию.
 *
 * @author Ломовской К.Ю.
 * @since 08.02.2020
 */
public class PropDemoDef {

    public static void main(String[] args) {

        Properties defList = new Properties();

        defList.put("Флорида", "Теллеси");
        defList.put("Висконсин", "Мэдисон");

        Properties capitals = new Properties(defList);

        capitals.put("Иллиноис", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        // получить множество ключей
        Set<?> states = capitals.keySet();

        // Показать все штаты и их столицы
        for (Object name: states)
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name) + ".");
        System.out.println();

        // Теперь Флорида будет найденна
        // в списке по умолчанию
        String str = capitals.getProperty("Флорида", "не найденна");
        System.out.println("Столица штата Флорида - " + str + ".");

    }
}
