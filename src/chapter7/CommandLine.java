package chapter7;

/**
 * Программа демонстрирующая,
 * выведение всех аргументов командной строки.
 * При запуске программы
 * передать аргументы командной строки: this is a test 100 -1
 *
 * @author Ломовской К.Ю.
 * @since 20.05.2019
 */
public class CommandLine {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
