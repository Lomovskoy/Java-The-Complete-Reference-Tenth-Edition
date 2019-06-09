package chapter8.usesuper;

/**
 * Программа демонстрирующая, класс В расширяющий класс А.
 *
 * @author Ломовской К.Ю.
 * @since 26.05.2019
 */
class B extends A{

    int i; // Этот член i скрывает член i из класса А

    B(int a, int b){
        super.i = a; // член i из класса A
        i = b;       // член i из класса B
    }

    void show(){
        System.out.println("член i из класса A: " + super.i);
        System.out.println("член i из класса B: " + i);
    }
}
