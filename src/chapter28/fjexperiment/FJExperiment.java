package chapter28.fjexperiment;

import java.util.concurrent.ForkJoinPool;

/**
 * Эта программа демонстрирующая пример
 * позволяющий экспериментировать с эффектом
 * от изменения порогового значения и уровня
 * параллелизма выполнения задач в классе ForkJoin.
 *
 * @author Ломовской К.Ю.
 * @since 19.03.2020
 */
public class FJExperiment {

    public static void main(String[] args) {
        int pLevel;
        int threshold;

        if (args.length != 2){
            System.out.println("Использование: FJExperiment парвлелизм порог");
            return;
        }

        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);

        // Эти переменные используются для измерения
        // времени выполненияф задчи
        long beginT, endT;

        // Создать пул задач. Обратите
        // внимание на уровень паралелизма
        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[100000000];

        for (int i = 0; i < nums.length; i++)
            nums[i] = i;

        Transform task = new Transform(nums, 0, nums.length, threshold);

        // Начать измерение времени выполнения задачи
        beginT = System.currentTimeMillis();

        // Запустить главную задачу типа ForkJoin
        fjp.invoke(task);

        // Завершить измерение времени выполнения задачи
        endT = System.currentTimeMillis();

        System.out.println("Уровень паралелизма: " + pLevel);
        System.out.println("Порог последовательной обработки: " + threshold);
        System.out.println("Истёкшее время: " + ((endT - beginT)) + " мс");
        System.out.println();
    }
}
