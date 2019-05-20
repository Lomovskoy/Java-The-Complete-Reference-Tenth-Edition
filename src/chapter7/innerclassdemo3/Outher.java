package chapter7.innerclassdemo3;

/**
 * Программа демонстрирующая,
 * применение внутреннего класса в цикле For.
 *
 * @author Ломовской К.Ю.
 * @since 20.05.2019
 */
class Outher {

    int outher_x = 100;

    void test(){
        for (int i = 0; i < 10; i++){
            class Inner {
                void display(){
                    System.out.println("Вывод: outher_x = " + outher_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }

}
