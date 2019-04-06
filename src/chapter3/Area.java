package chapter3;

/**
 * Вычисление площади круга,
 * используя переменные типа double.
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
public class Area {

    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8;           // Разиус окружности
        pi = 3.1416;        // Приблизительное занчение числа pi
        a = pi * r * r;     // Вычисление прощади круга

        System.out.println("Плдощадь круга равна " + a);
    }
}
