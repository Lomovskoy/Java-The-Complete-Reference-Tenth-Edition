package chapter3;

/**
 * Демонстрация того, что:
 * символьные переменные ведут себя как целочисленные значения
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
class CharDemo2 {

    public static void main(String[] args) {
        char ch1;

        ch1 = 'X';
        System.out.println("ch1 содержит: " + ch1);

        ch1 ++; // Увеличсиваем на единицу значение переменной.
        System.out.println("ch1++ содержит: " + ch1);

    }
}
