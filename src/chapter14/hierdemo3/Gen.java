package chapter14.hierdemo3;

/**
 * Класс демонстрирующий, использование оператора
 * instanseof в иерархии обощённых классов
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
