package chapter17;

/**
 * Класс демонстрирующий создание
 * одного классса  string из другого.
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class MakeString {

    public static void main(String[] args) {

        char[] c = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);
    }
}
