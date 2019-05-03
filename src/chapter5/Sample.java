package chapter5;

/**
 * Программа демонстрирующая,
 * управление цикла for несколькими перепменными.
 *
 * @author Ломовской К.Ю.
 * @since 13.04.2019
 */
class Sample {

    public static void main(String[] args) {

        int a, b;

        b = 4;
        for (a = 1; a < b; a++){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }
}
