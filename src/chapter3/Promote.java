package chapter3;

/**
 * Программа демонстрирующая,
 * правила продвижения типов.
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
class Promote {

    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = 10.1234;
        
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("Result = " + result);
    }
}
