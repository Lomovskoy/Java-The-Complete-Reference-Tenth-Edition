package chapter15.instancemethwithobjectrefdemo;

/**
 * Обощённый функционаьнй интерфейс с методом
 * принимающим два ссылочных аргумента и
 * возвращающим логическое значение.
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
interface MyFunc<T> {
    boolean func(T v1, T v2);
}
