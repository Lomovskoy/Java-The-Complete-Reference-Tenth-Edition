package chapter8.abstractdemo;

/**
 * Программа демонстрирующая,
 * простой пример абстракции.
 *
 * @author Ломовской К.Ю.
 * @since 09.06.2019
 */
public class B extends A{

    @Override
    void callme() {
        System.out.println("Реализация метода callme() в классе В");
    }
}
