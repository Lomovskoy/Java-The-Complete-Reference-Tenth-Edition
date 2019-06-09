package chapter8.findareas;

/**
 * Программа демонстрирующая,
 * динамического полиморфизма.
 *
 * @author Ломовской К.Ю.
 * @since 09.06.2019
 */
class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    // Переопределить метод area() для прямоугольного треугольника
    double area(){
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
