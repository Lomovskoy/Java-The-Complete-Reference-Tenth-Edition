package chapter8.abstractdemo;

/**
 * Программа демонстрирующая,
 * простой пример абстракции.
 *
 * @author Ломовской К.Ю.
 * @since 09.06.2019
 */
class AbstractDemo {

    public static void main(String[] args) {

        B b = new B();
        b.callme();
        b.callmeToo();
    }
}
