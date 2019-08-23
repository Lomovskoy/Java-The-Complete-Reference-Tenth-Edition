package chapter18;

/**
 * Класс демонстрирующий применение
 * методов toRadians() и toDegrees().
 *
 * @author Ломовской К.Ю.
 * @since 23.08.2019
 */
class Angles {

    public static void main(String[] args) {

        double theta = 120.0;
        System.out.println(theta + " градусов равно " + Math.toRadians(theta) + " радиан.");

        theta = 1.312;
        System.out.println(theta + " радиан равно " + Math.toDegrees(theta) + " градусов.");
    }
}
