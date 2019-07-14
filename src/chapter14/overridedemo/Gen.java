package chapter14.overridedemo;

/**
 * Класс демонстрирующий, переопределение
 * обощённого метода в обощённом классе.
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    // Возвратить объект ob
    T getOb(){
        System.out.print("Мметод getOb() из класса Gen: ");
        return ob;
    }

}
