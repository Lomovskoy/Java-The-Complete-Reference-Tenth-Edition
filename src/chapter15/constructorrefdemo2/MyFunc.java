package chapter15.constructorrefdemo2;

/**
 * Функционаьнй обощённый интерфейс определяющий метод,
 * возвращающий ссылку на класс MeClass.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
interface MyFunc<T> {
    MyClass<T> func(T n);
}
