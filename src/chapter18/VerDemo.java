package chapter18;

/**
 * Класс демонстрирующий применение
 * класса Runtime.Version().
 *
 * @author Ломовской К.Ю.
 * @since 22.08.2019
 */
class VerDemo {

    public static void main(String[] args) {

        Runtime.Version ver = Runtime.version();

        // Вывести номера отдльных версий
        System.out.println("Основной номер версии: " + ver.major());
        System.out.println("Дополнительный номер версии: " + ver.minor());
        System.out.println("Номер версии системы защиты: " + ver.security());

    }
}
