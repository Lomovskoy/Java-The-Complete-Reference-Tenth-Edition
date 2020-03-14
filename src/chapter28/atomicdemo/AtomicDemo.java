package chapter28.atomicdemo;

/**
 * Эта программа демонстрирующая пример
 * выполнения атомарный операций.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class AtomicDemo {

    public static void main(String[] args) {

        new AtomicThread("A").run();
        new AtomicThread("B").run();
        new AtomicThread("C").run();
    }
}
