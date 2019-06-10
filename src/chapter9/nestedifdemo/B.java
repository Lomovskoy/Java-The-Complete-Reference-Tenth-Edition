package chapter9.nestedifdemo;

/**
 * Программа демонстрирующая,
 * пример реализации вложенного интерфейса.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class B implements A.NestedIF{

    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
