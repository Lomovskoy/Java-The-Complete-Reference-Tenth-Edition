package chapter17;

/**
 * Класс демонстрирующий применение
 * метода equals() и equalsIgnoreCase()
 * при сравнении символьных строк.
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class EqualsDemo {

    public static void main(String[] args) {

        String s1 = "Привет";
        String s2 = "Привет";
        String s3 = "Прощай";
        String s4 = "ПРИВЕТ";

        System.out.println(s1 + " равно " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " равно " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " равно " + s4 + " -> " + s1.equals(s4));
        System.out.println(s1 + " равно без учёто регистра " + s4 + " -> " + s1.equalsIgnoreCase(s4));
    }
}
