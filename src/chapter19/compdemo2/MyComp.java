package chapter19.compdemo2;

import java.util.Comparator;

/**
 * Класс демонстрирующий компаратор
 * для сравнения символьных строк в
 * обратном порядке.
 *
 * @author Ломовской К.Ю.
 * @since 27.08.2019
 */
class MyComp implements Comparator<String> {
    public int compare(String a, String b){
        return a.compareTo(b);
    }
}
