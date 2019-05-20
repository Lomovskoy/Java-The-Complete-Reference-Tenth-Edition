package chapter7;

/**
 * Программа демонстрирующая, применение свойств
 * length, определяющего длинну массива.
 *
 * @author Ломовской К.Ю.
 * @since 20.05.2019
 */
class Length {

    public static void main(String[] args) {

        int a1[] = new int[10];
        int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
        int a3[] = {4, 3, 2, 1};

        System.out.println("Длинна массива а1 равна " + a1.length);
        System.out.println("Длинна массива а2 равна " + a2.length);
        System.out.println("Длинна массива а3 равна " + a3.length);
    }
}
