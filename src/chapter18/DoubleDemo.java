package chapter18;

/**
 * Класс демонстрирующий создание
 * класса Double двумя сповобами.
 *
 * @author Ломовской К.Ю.
 * @since 21.08.2019
 */
class DoubleDemo {

    public static void main(String[] args) {

        Double d1 = Double.valueOf(3.14159);
        Double d2 = Double.valueOf("314159E-5");
        System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));

    }
}
