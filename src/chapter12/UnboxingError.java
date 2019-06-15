package chapter12;
/**
 * Программа демонстрирующая,
 * ошибку порождаемую ручной распаковкой.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */

public class UnboxingError {

    public static void main(String[] args) {

        // Автоупаковка значения 1000
        Integer iOb = 1000;

        // Ручная распаковка значения как относящегося к типу byte!!!
        int i = iOb.byteValue();

        // Значение 1000 не выводлится!
        System.out.println(i);
    }
}
