package chapter15.lambdaexceptiondemo;

/**
 * Функционаьнй интерфейс, ожидающий исключения.
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
interface DoubleNumericArreyFunc {
    double func(double[] n) throws EmptyArrayException;
}
