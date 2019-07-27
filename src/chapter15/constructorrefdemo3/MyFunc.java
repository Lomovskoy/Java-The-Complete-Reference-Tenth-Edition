package chapter15.constructorrefdemo3;

/**
 * Функционаьнй обощённый интерфейс определяющий метод,
 * являющийся фаьрикой классов.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
interface MyFunc<R, T> {
    R func(T n);
}
