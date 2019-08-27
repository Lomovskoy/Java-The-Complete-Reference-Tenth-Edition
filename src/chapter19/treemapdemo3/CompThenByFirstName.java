package chapter19.treemapdemo3;

import java.util.Comparator;

/**
 * Класс демонстрирующий применение
 * компаратора сравнения по Ф.И.О вкладчиков.
 *
 * @author Ломовской К.Ю.
 * @since 27.08.2019
 */
class CompThenByFirstName implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        return aStr.compareToIgnoreCase(bStr);
    }
}
