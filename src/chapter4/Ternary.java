package chapter4;

/**
 * Программа демонстрирующая,
 * использования тернарного оператора.
 *
 * @author Ломовской К.Ю.
 * @since 07.04.2019
 */
class Ternary {

    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // Получаем абсалютное значение i

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // Получаем абсалютное значение i

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
    }
}
