package chapter15.lambdademo2;

/**
 * Класс демонстрирующий применение
 * лямбда выражения, принимающего один параметр.
 *
 * @author Ломовской К.Ю.
 * @since 20.07.2019
 */
class LambdaDemo2 {

    public static void main(String[] args) {

        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10))
            System.out.println("Число 10 чётное");
        if (!isEven.test(9))
            System.out.println("Число 9 не чётное");

        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1))
            System.out.println("Число 1 положительное");
        if (!isNonNeg.test(-1))
            System.out.println("Число -1 отрицательное");

    }
}
