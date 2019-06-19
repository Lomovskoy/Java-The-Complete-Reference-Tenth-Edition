package chapter13;

/**
 * Программа демонстрирующая, вычисление
 * длинный гипотенузы прямоугольного треугольника.
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class Hiport {

    public static void main(String[] args) {
        double side1, side2;
        double hyport;
        side1 = 3.0;
        side2 = 4.0;

        hyport = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("При заданной длинне сторон "
        + side1 + " и " + side2 + " гипотенуза равна " + hyport);
    }
}
