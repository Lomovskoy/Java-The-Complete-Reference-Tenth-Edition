package chapter3;

/**
 * Программа демонстрирующая,
 * вычисление среднего значения из одномерного массива.
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
class Average {

    public static void main(String[] args) {
        double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };
        double result = 0;
        int i;

        for (i = 0; i < 5; i++)
            result = result + nums[i];

        System.out.println("Среднее значение равно " + result / 5);
    }
}
