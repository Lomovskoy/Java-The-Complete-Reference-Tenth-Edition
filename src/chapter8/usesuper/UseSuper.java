package chapter8.usesuper;

/**
 * Программа демонстрирующая, применение ключевое
 * слово super для предотвращения сокрытие имён.
 *
 * @author Ломовской К.Ю.
 * @since 26.05.2019
 */
class UseSuper {

    public static void main(String[] args) {

        B supOb = new B(1, 2);
        supOb.show();
    }
}
