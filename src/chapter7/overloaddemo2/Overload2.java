package chapter7.overloaddemo2;

/**
 * Программа демонстрирующая, использование
 * перегрудженных методов с приведением типов.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
class Overload2 {

    public static void main(String[] args) {

        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);             // Здесь выхыватся вариант метода test(double)
        ob.test(123.25);    // И здесь выхыватся вариант метода test(double)
    }
}
