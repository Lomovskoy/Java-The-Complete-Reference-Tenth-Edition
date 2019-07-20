package chapter15.genericfunctionalinterfacedemo;

/**
 * Обощённый функционаьнй интерфейс.
 *
 * @author Ломовской К.Ю.
 * @since 20.07.2019
 */
interface SomeFunc<T> {
    T func(T t);
}
