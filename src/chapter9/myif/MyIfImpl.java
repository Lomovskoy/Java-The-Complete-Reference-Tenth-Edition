package chapter9.myif;

/**
 * Программа демонстрирующая,
 * интерфейс с методами по умолчанию.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class MyIfImpl implements MyIf {

    // В этом класса должен быть реализован только
    // метод getNumber(), определённый в интерфейсе MyIf
    // А вызов метода getString()резрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}
