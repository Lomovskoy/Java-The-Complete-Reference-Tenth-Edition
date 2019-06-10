package chapter9.p2;

/**
 * Программа демонстрирующая, пример получения
 * экземпляров различных классов из пакета р2.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class Demo {

    public static void main(String[] args) {

        Protection2 ob1 = new Protection2();
        OtherPackage ob2 = new OtherPackage();
    }
}
