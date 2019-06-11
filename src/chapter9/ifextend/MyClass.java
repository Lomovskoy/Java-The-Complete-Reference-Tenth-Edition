package chapter9.ifextend;

/**
 * Программа демонстрирующая,
 * расширение интерфейсов.
 *
 * @author Ломовской К.Ю.
 * @since 11.06.2019
 */
public class MyClass implements B {

    public void meth1() {
        System.out.println("Реализация метода meth1()");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2()");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3()");
    }
}
