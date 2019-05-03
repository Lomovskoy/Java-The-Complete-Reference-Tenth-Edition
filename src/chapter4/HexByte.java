package chapter4;

/**
 * Программа демонстрирующая,
 * маскирвоания двоичных рахрядов расширения знака.
 *
 * @author Ломовской К.Ю.
 * @since 07.04.2019
 */
class HexByte {

    public static void main(String[] args) {
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
