package chapter14.genifdemo;

/**
 * Обощённый интерфейс MinMax для определениея
 * минимального и максимального значений
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
interface MinMax <T extends Comparable<T>> {
    T min();
    T max();
}
