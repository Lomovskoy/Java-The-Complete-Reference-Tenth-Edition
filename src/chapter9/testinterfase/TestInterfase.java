package chapter9.testinterfase;

/**
 * Программа демонстрирующая,
 * доступ к реализхации через ссылки на интерфейсы.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class TestInterfase {

    public static void main(String[] args) {

        Callback c = new Client();
        c.callback(42);
    }
}
