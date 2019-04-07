package chapter4;

/**
 * Программа демонстрирующая,
 * операция сдвиг в лево, как способ умножения на 2.
 *
 * @author Ломовской К.Ю.
 * @since 07.04.2019
 */
public class MultByTwo {

    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
