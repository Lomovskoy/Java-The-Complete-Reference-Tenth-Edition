package chapter7.staticdemo;

/**
 * Программа демонстрирующая, создание класса
 * с статическими переменными и методы.
 *
 * @author Ломовской К.Ю.
 * @since 20.05.2019
 */
public class StaticDemo {

    static int a = 42;
    static int b = 99;

    static void callme(){
        System.out.println("a = " + a);
    }
}
