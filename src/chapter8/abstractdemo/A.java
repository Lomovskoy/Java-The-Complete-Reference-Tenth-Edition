package chapter8.abstractdemo;

/**
 * Программа демонстрирующая,
 * простой пример абстракции.
 *
 * @author Ломовской К.Ю.
 * @since 09.06.2019
 */
abstract class A {

    abstract void callme();

    // Абстрактные классы не все могут содержать конкретные методы
    void  callmeToo(){
        System.out.println("Это конкретный метод");
    }
}
