package chapter9.mypackage;

/**
 * Программа демонстрирующая, класс Balance объявлен как public,
 * по этому им можно воспользоватьсяи вызывать его конструктор.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class TestBalance {

    public static void main(String[] args) {

        Balance test = new Balance("J. J. Jasprs", 99.88);

        test.show();    // Можно так же вызвать метод show()

    }
}
