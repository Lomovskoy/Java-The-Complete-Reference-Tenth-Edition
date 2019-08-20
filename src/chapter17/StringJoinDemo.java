package chapter17;

/**
 * Класс демонстрирующий использование
 * метода join(), определённого в классе String.
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class StringJoinDemo {

    public static void main(String[] args) {

        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569", "E-mail: John@HerbShildt.com");
        System.out.println(result);
    }
}
