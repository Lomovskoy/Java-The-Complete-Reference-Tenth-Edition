package chapter13;

/**
 * Программа демонстрирующая,
 * перегружденыне конструкторы
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class MyClass {

    int a;
    int b;

    public MyClass(int i, int j) {
        a = i;
        b = j;
    }

    public MyClass(int i) {
        a = i;
        b = i;
    }

    public MyClass() {
        a = 0;
        b = 0;
    }
}
