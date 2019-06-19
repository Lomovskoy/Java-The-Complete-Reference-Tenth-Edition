package chapter13;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Программа демонстрирующая, вычисление
 * длинный гипотенузы прямоугольного треугольника
 * с статическим импортом класса.
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class HiportStatic {

    public static void main(String[] args) {
        double side1, side2;
        double hyport;
        side1 = 3.0;
        side2 = 4.0;

        // Здесь методы sqrt и pow можно вызывать
        // непосредственно, опусвкая имя их класса
        hyport = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("При заданной длинне сторон "
        + side1 + " и " + side2 + " гипотенуза равна " + hyport);
    }
}
