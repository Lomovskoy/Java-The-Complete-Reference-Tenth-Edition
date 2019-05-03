package chapter7.overloaddemo;

/**
 * Программа демонстрирующая,
 * использование перегрудженных методов.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
class Overload {

    public static void main(String[] args) {

        OverloadDemo ob = new OverloadDemo();
        double result;

        // Вызвать все варианты метода test
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова  ob.test(123.25): " + result);
    }
}
