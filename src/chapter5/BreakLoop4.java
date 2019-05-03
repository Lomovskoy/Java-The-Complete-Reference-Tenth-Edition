package chapter5;

/**
 * Программа демонстрирующая,
 * применение оператора break для вложенных циклов.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
class BreakLoop4 {

    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; // Выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выведена");
        }
        System.out.println("Циклы завершёны.");
    }
}
