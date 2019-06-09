package chapter8.findareas;

/**
 * Программа демонстрирующая,
 * динамического полиморфизма.
 *
 * @author Ломовской К.Ю.
 * @since 09.06.2019
 */
public class FindAreas {

    public static void main(String[] args) {

        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figure;

        figure = r;
        System.out.println("Площадь равна " + figure.area());

        figure = t;
        System.out.println("Площадь равна " + figure.area());

        figure = f;
        System.out.println("Площадь равна " + figure.area());

    }
}
