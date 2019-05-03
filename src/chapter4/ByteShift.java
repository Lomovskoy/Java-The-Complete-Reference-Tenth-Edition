package chapter4;

/**
 * Программа демонстрирующая,
 * операция сдвиг в лево, значения byte.
 *
 * @author Ломовской К.Ю.
 * @since 07.04.2019
 */
class ByteShift {

    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Изначальное значение а " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
