package chapter4;

/**
 * Программа демонстрирующая,
 * порязрядные составные операции.
 *
 * @author Ломовской К.Ю.
 * @since 07.04.2019
 */
class OptBitEquals {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
