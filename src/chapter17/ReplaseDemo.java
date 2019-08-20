package chapter17;

/**
 * Класс демонстрирующий использование
 * метода replase().
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class ReplaseDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Это простой тест.");
        sb.replace(4, 8, "был");
        System.out.println("После замены: " + sb);
    }
}
