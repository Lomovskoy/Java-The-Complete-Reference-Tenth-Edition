package chapter8.abstractarea;

/**
 * Программа демонстрирующая,
 * применение абстрактныхз методов и классов.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class Triangle extends Figure{

    public Triangle(double a, double b) {
        super(a, b);
    }

    // Переопределить метод area() для прямоугольного треугольника
    double area() {
        return dim1 * dim2 / 2;
    }
}
