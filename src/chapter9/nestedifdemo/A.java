package chapter9.nestedifdemo;

/**
 * Программа демонстрирующая,
 * пример вложенного интерфейса.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class A {

    // Это вложденный интерфейс
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}
