package chapter14.brigedemo;

/**
 * Класс демонстрирующий,
 * создание мостового метода.
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
        return ob;
    }

}
