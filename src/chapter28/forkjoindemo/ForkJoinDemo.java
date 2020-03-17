package chapter28.forkjoindemo;

import java.util.concurrent.ForkJoinPool;

/**
 * В этом классе ForkJoin преобразует (через класс RecursiveAction)
 * значени элементов массива типа double в их квадратные корни.
 *
 * @author Ломовской К.Ю.
 * @since 17.03.2020
 */
public class ForkJoinDemo {

    public static void main(String[] args) {
        // Создать пул задач
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[100000];

        // Присвоить некоторые значения
        for (int i = 0; i < nums.length; i++)
            nums[i] =  i;

        System.out.println("Часть исходной последовательности:");

        for (int i = 0; i < 10; i++)
            System.out.print(nums[i] + " ");

        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        // Запустить главную задачу типа ForkJoinTask
        // на выполнение
        fjp.invoke(task);

        System.out.println("Часть преобразованной последовательности " +
                "с точностью до четырёх знаков после запятой: ");

        for (int i = 0; i < 10; i++)
            System.out.format("%.4f ", nums[i]);
        System.out.println();
    }

}
