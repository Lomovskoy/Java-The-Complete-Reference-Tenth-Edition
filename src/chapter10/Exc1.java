package chapter10;

/**
 * Программа демонстрирующая,
 * пример не обрабатываемого исключения.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class Exc1 {

    static void subRoutIne(){
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        Exc1.subRoutIne();
    }
}
