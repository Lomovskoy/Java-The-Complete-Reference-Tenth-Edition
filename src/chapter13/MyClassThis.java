package chapter13;

/**
 * Программа демонстрирующая,
 * перегружденыне конструкторы
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class MyClassThis {

    int a;
    int b;

    public MyClassThis(int i, int j) {
        a = i;
        b = j;
    }

    public MyClassThis(int i) {
        this(i, i);
    }

    public MyClassThis() {
        this(0);
    }
}
