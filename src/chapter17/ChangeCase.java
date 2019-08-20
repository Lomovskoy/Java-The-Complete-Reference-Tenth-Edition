package chapter17;

/**
 * Класс демонстрирующий использование
 * методов toUpperCase() и toLowerCase().
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class ChangeCase {

    public static void main(String[] args) {

        String s = "Это тест.";
        System.out.println("Исходная строка: " + s);
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("Верхний регистр букв: " + upper);
        System.out.println("Нижний регистр букв: " + lower);
    }
}
