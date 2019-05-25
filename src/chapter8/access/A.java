package chapter8.access;

/**
 * Программа демонстрирующая, создание супер класса.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class A {

    int i;          // Этот член класса иткрыт по умолчанию
    private int j;  // Этот член класса закрыт а классе А

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}
