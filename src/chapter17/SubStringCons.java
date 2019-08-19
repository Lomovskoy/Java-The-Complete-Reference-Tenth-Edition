package chapter17;

/**
 * Класс демонстрирующий создание
 * символьной строки из массива байтов.
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class SubStringCons {

    public static void main(String[] args) {

        byte[] ascii = {65, 66, 67, 68, 69, 70};

        String s1 = new String(ascii);
        System.out.println(s1);

        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);
    }
}
