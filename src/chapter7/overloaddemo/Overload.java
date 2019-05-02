package chapter7.overloaddemo;

public class Overload {

    public static void main(String[] args) {

        OverloadDemo ob = new OverloadDemo();
        double result;

        // Вызвать все варианты метода test
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("РЕзультат вызова  ob.test(123.25): " + result);
    }
}
