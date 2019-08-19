package chapter17;

/**
 * Класс демонстрирующий применение
 * метода getChars(), для вырезания подстроки.
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class GetCharsDemo {

    public static void main(String[] args) {

        String s = "Это демонстрационная строка getChars()";
        int start = 4;
        int end = 8;

        char[] buf = new char[end - start];
        s.getChars(start, end, buf, 0);

        System.out.println(buf);
    }
}
