package chapter14.genifdemo;

/**
 * Реализация обощённого интерфейса MinMax
 * для определениея минимального и максимального значений
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class MinMaxImpl<T extends Comparable<T>> implements MinMax<T>{

    T[] vals;

    MinMaxImpl(T[] o){
        vals = o;
    }

    // Возврат минимального значения из масива vals
    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) < 0)
                v = vals[i];
        return v;
    }

    // Возврат максимального значения из масива vals
    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0)
                v = vals[i];
        return v;
    }
}
