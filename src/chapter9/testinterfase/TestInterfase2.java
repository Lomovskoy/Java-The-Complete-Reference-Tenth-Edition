package chapter9.testinterfase;

/**
 * Программа демонстрирующая,
 * доступ к реализхации через ссылки на интерфейсы.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class TestInterfase2 {

    public static void main(String[] args) {

        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;                 // Теперь переменная ссылается на объект типа AnotherClient

        c.callback(42);
    }
}
