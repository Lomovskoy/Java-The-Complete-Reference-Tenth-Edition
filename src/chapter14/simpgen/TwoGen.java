package chapter14.simpgen;

/**
 * Программа демонстрирующая, простой
 * обощённый класс с двумя параметрами типа: T, V.
 *
 * @author Ломовской К.Ю.
 * @since 26.06.2019
 */
class TwoGen<T, V> {

    T ob1;
    V ob2;

    // Пердать конструктору ссылки на объекты типа T и V
    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    // Показать типы T и V
    void showTypes(){
        System.out.println("Тип Т: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}
