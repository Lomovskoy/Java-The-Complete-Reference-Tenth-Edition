package chapter7.accesstest;

/**
 * Программа демонстрирующая, модификаторы доступа public и protected.
 *
 * @author Ломовской К.Ю.
 * @since 04.05.2019
 */
class AccessTest {

    public static void main(String[] args) {

        Test ob = new Test();

        // Эти операторы правильны, по этому члены a и b
        // этого класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и вызовет ошибку
        //ob.c = 100; // ОШИБКА!

        // Доступ к члену с данного класса долджен
        // осуществляться с помошью методов его класса
        ob.setc(100); // ВЕРНО!
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
