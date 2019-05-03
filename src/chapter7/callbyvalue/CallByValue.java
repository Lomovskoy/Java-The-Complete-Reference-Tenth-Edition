package chapter7.callbyvalue;

/**
 * Программа демонстрирующая,
 * передачу аргументов по значению.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
class CallByValue {

    public static void main(String[] args) {

        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
