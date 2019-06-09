package chapter8.abstractarea;

/**
 * Программа демонстрирующая,
 * применение абстрактныхз методов и классов.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class Rectangle extends Figure{

    Rectangle(double a, double b){
        super(a, b);
    }

    // Переопределить метод area() для прямоугольника
    double area() {
        System.out.println("В области прямоугольника");
        return dim1 * dim2;
    }
}
