package chapter19.treemapdemo2;

import java.util.Comparator;

/**
 * Класс демонстрирующий применение
 * компаратора для сравнения по последжним словам.
 *
 * @author Ломовской К.Ю.
 * @since 27.08.2019
 */
class TComp implements Comparator<String> {

    public int compare(String aStr, String bStr) {

        int i, j, k;

        // Найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));

        // Если фамилии совпадают, проверить имя и фамилию полностью
        if (k == 0)
            return aStr.compareTo(bStr);
        else
            return k;
    }
}
