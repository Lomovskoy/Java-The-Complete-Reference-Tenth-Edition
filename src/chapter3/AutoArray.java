package chapter3;
/**
 * Программа демонстрирующая, одновременное
 * создание и инициализацию одномерного массива.
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */

public class AutoArray {

    public static void main(String[] args) {

        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("В апреле " + monthDays[3] + " дней.");
    }
}
