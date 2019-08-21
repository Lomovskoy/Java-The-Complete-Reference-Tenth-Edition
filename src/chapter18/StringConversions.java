package chapter18;

/**
 * Класс демонстрирующий преобразование
 * целого числа в двоичную, шестнадцатеричную
 * и восьмеричную формы.
 *
 * @author Ломовской К.Ю.
 * @since 21.08.2019
 */
class StringConversions {

    public static void main(String[] args) {

        int num = 19648;

        System.out.println("Число " + num + " в двоичной форме: " + Integer.toBinaryString(num));
        System.out.println("Число " + num + " в восьмеричной форме: " + Integer.toOctalString(num));
        System.out.println("Число " + num + " в шестнадцатеричной форме: " + Integer.toHexString(num));
    }
}
