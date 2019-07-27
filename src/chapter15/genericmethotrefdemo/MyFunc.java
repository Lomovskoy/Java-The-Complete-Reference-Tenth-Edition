package chapter15.genericmethotrefdemo;

/**
 * Обощённый функционаьнй интерфейс для обработки массива
 * значений, возвращающий целочисленный результат.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
interface MyFunc<T> {
    int func(T[] vals, T v);
}
