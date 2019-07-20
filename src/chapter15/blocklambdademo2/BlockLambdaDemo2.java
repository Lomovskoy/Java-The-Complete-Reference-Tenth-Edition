package chapter15.blocklambdademo2;

/**
 * Класс демонстрирующий блочное лямбда-выражение,
 * изменяющее порядок следования символов в строке.
 *
 * @author Ломовской К.Ю.
 * @since 20.07.2019
 */
class BlockLambdaDemo2 {

    public static void main(String[] args) {

        // Это блочное лямбда-выражение изменяет
        // порядок следования символов в строке.
        StringFunc reverse = (str) -> {

            String result = "";
            int i;

            for (i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };
        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));
    }
}
