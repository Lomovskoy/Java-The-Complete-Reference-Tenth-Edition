package chapter7.recursion;

/**
 * Программа демонстрирующая,
 * пример использование метода с рекурсией.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
class Recursion {

    public static void main(String[] args) {

        Factorial f = new Factorial();
        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}
