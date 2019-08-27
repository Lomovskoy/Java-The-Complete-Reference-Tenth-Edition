package chapter19.compdemo;

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

        String aStr, bStr;
        aStr = a;
        bStr = b;

        // Выполнить сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }

    // Переопределять метод equals() не требуется
}
