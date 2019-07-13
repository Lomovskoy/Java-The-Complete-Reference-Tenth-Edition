package chapter14.hierdemo;

/**
 * Класс демонстрирующий, что в подкласс
 * могут выть введены свои параметры типа
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class Gen2<T, V> extends Gen<T> {

    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2(){
        return ob2;
    }
}
