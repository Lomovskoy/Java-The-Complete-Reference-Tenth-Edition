package chapter17;

/**
 * Класс демонстрирующий применение
 * разных форм методов indexOf() и lastIndexOf().
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class IndexIfDemo2 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("one two one");
        int i;

        i = sb.indexOf("one");
        System.out.println("Индекст первого вхождения: " + i);

        i = sb.lastIndexOf("one");
        System.out.println("Индекст последнего вхождения: " + i);
    }
}
