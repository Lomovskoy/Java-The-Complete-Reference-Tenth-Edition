package chapter7.innerclassdemo1;

/**
 * Программа демонстрирующая,
 * применение внутреннего класса.
 *
 * @author Ломовской К.Ю.
 * @since 20.05.2019
 */
class Outher {

    int outher_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    // Это внутренний класс
    class Inner {
        void display(){
            System.out.println("Вывод: outher_x = " + outher_x);
        }
    }
}
