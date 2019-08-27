package chapter19.treemapdemo3;

import java.util.Comparator;

/**
 * Класс демонстрирующий применение
 * компаратора сравнения по фамилиям вкладчиков.
 *
 * @author Ломовской К.Ю.
 * @since 27.08.2019
 */
class CompLastName implements Comparator<String> {

    public int compare(String aStr, String bStr) {

        int i, j;

        // Найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
