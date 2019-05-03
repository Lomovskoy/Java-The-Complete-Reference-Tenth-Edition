package chapter7.callbyvalue;

/**
 * Программа демонстрирующая, что передача
 * примитивных типов передаётся по значению.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
class Test {

    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}
