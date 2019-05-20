package chapter7.staticdemo;

/**
 * Программа демонстрирующая, вызов класса
 * с статическими переменными и методы.
 *
 * @author Ломовской К.Ю.
 * @since 20.05.2019
 */
class StataticByName {
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
