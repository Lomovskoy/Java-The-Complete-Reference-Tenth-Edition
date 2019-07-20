package chapter15.blocklambdademo;

/**
 * Класс демонстрирующий блочное лямбда-выражение,
 * вычисляющее факториал целочисленного значения.
 *
 * @author Ломовской К.Ю.
 * @since 20.07.2019
 */
class BlockLambdaDemo {

    public static void main(String[] args) {

        // Это блочное лямбда-выражение вычисляет
        // факториал целочисленного значения
        NumericFunc factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result *= i;

            return result;
        };

        System.out.println("Факториал числа 3 = " + factorial.func(3));
        System.out.println("Факториал числа 5 = " + factorial.func(5));
    }
}
