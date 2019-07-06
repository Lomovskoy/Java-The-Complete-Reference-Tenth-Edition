package chapter14.boundewildcard;

/**
 * Класс демонстрирующий,
 * трёхмерные коардинаты.
 *
 * @author Ломовской К.Ю.
 * @since 06.07.2019
 */
class ThreeD extends TwoD{

    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}
