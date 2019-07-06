package chapter14.boundewildcard;

/**
 * Класс демонстрирующий,
 * четырёхмерные коардинаты.
 *
 * @author Ломовской К.Ю.
 * @since 06.07.2019
 */
class FourD extends ThreeD{

    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}
