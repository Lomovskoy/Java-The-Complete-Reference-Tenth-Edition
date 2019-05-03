package chapter5;

/**
 * Программа демонстрирующая,
 * применение оператора break для вложенных циклов.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
class BreakLoop3 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершён.");
    }
}
