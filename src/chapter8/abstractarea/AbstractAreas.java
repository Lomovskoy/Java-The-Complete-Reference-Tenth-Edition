package chapter8.abstractarea;

/**
 * Программа демонстрирующая,
 * применение абстрактныхз методов и классов.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
public class AbstractAreas {

    public static void main(String[] args) {

        //Figure f = new Figure(10, 10) // Теперь не допустимо
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figure; // Верно, хотя объект не создаётся

        figure = r;
        System.out.println("Площадь равна " + figure.area());

        figure = t;
        System.out.println("Площадь равна " + figure.area());

    }
}
