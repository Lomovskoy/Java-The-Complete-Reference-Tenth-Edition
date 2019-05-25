package chapter8;

/**
 * Программа демонстрирующая, создание подкласса
 * путём расширением супер класса.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class B extends A {

    int k;

    void showk(){
        System.out.println("k: " + k);
    }

    void sum(){
        System.out.println("i + j + k: " + (i + j + k));
    }
}
