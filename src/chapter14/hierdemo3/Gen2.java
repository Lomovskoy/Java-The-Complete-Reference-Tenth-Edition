package chapter14.hierdemo3;

/**
 * Класс демонстрирующий, использование оператора
 * instanseof в иерархии обощённых классов
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class Gen2<T> extends Gen<T> {

    Gen2(T o) {
        super(o);
    }
}
