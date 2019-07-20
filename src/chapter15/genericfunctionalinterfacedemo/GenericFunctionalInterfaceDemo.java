package chapter15.genericfunctionalinterfacedemo;

/**
 * Класс демонстрирующий применение
 * обощённого функционального интерфейса.
 *
 * @author Ломовской К.Ю.
 * @since 20.07.2019
 */
class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Используцем строковый варинт функционального интерфейса
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length()-1; i >= 0; i--)

                result += str.charAt(i);
            return result;
        };

        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));

        // Используцем числовой варинт функционального интерфейса
        SomeFunc<Integer> factorial = (n) -> {

            int result = 1;

            for (int i = 1; i <= n; i++)
                result *= i;

            return result;
        };

        System.out.println("Факториал числа 3 = " + factorial.func(3));
        System.out.println("Факториал числа 5 = " + factorial.func(5));
    }
}
