package chapter9.myif;

/**
 * Программа демонстрирующая,
 * интерфейс с методами по умолчанию.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class DefaultMethodDemo {

    public static void main(String[] args) {

        MyIfImpl obj = new MyIfImpl();

        // Метод getNumber() можно вызвать, так как он
        // явно реализован в классе MyIfImpl
        System.out.println(obj.getNumber());

        // Метод getString() так же можно вызвать
        // так как в интерфейсе имеется его реалихация
        // по умолчанию
        System.out.println(obj.getString());
    }
}
