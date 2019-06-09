package chapter8.override2;

/**
 * Программа демонстрирующая,
 * переопределение метода.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class Override {

    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show("Это k: "); // Здесь вызываается метод show() из класса В
        subOb.show();               // Здесь вызываается метод show() из класса A
    }
}
