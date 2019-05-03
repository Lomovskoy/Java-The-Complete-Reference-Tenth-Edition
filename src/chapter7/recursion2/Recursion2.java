package chapter7.recursion2;

/**
 * Программа демонстрирующая,
 * пример использование метода с рекурсией.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
public class Recursion2 {

    public static void main(String[] args) {

        RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}
