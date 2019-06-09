package chapter8.abstractarea;

/**
 * Программа демонстрирующая,
 * применение абстрактныхз методов и классов.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
abstract class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    // Теперь метод area() объявляется абстрактным
    abstract double area();
}
