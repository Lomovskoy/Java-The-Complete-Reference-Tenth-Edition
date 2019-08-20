package chapter17;

/**
 * Класс демонстрирующий использование
 * метода append().
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class AppendDemo {

    public static void main(String[] args) {

        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);

        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
