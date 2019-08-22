package chapter18;

/**
 * Класс демонстрирующий измерение
 * времени выполнения программы.
 *
 * @author Ломовской К.Ю.
 * @since 22.08.2019
 */
class Elansed {

    public static void main(String[] args) {

        long start, end;

        // Измерить время перебора от 0 до 100 000 000
        System.out.println("Измерение времени перебора от 0 до 100 000 000");

        // Получить начальный момент времени
        //start = System.currentTimeMillis();
        start = System.nanoTime();

        for (long i = 0; i < 100000000L; i++);

        // Получить конечный момент времени
        //end = System.currentTimeMillis();
        end = System.nanoTime();

        //System.out.println("Время выполнения: " + (end - start) + " ms");
        System.out.println("Время выполнения: " + (end - start) + " ns");
    }
}
