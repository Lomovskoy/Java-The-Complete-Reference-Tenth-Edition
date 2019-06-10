package chapter9.testinterfase;

/**
 * Программа демонстрирующая,
 * ещё одна реализацию интерфейса.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class AnotherClient implements Callback {

    // Реализовать метод интерфейся Callback
    @Override
    public void callback(int param) {
        System.out.println("Ещё один вариант метода callback()");
        System.out.println("p в квадрате равно " + param);
    }
}
