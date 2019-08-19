package chapter17;

/**
 * Класс демонстрирующий разницу между
 * equals() и == при сравнении символьных строк.
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class EqualsNotEqualseTo {

    public static void main(String[] args) {

        String s1 = "Привет";
        String s2 = new String(s1);

        System.out.println(s1 + " эквивалентно " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " равно " + s2 + " -> " + (s1 == s2));
    }
}
