package chapter17;

/**
 * Класс демонстрирующий использование
 * методов length() и capacity().
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Буфер = " + sb);
        System.out.println("Длинна = " + sb.length());
        System.out.println("Ёмкость = " + sb.capacity());
    }
}
