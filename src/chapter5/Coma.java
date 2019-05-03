package chapter5;

/**
 * Программа демонстрирующая,
 * использование запятой в операторе цикла for.
 *
 * @author Ломовской К.Ю.
 * @since 13.04.2019
 */
class Coma {

    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
