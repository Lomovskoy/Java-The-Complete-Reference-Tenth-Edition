package chapter7.innerclassdemo2;

/**
 * Программа демонстрирующая,
 * не подлежит компиляции.
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
        int y = 10; // y - локальная переменная класса Inner
        void display(){
            System.out.println("Вывод: outher_x = " + outher_x);
        }
    }

//    void showy(){
//        System.out.println(y); // Ошибка сдесь переменная у недоступна
//    }
}
