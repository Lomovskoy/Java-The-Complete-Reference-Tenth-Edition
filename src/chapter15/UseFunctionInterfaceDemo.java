package chapter15;

import java.util.function.Function;

/**
 * Класс демонстрирующий использование переопределённого
 * функционального интерфейса Function.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class UseFunctionInterfaceDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result *= i;

            return result;
        };

        System.out.println("Факториал числа ");
    }
}
