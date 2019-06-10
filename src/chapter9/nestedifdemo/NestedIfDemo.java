package chapter9.nestedifdemo;

/**
 * Программа демонстрирующая,
 * пример реализации вложенного интерфейса.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class NestedIfDemo {

    public static void main(String[] args) {

        // Использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();
        
        if (nif.isNotNegative(10))
            System.out.println("Число 10 не отрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не убдет выведено");
    }
}
