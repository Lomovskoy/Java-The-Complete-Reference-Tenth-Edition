package chapter28.recurtaskdemo;

import java.util.concurrent.ForkJoinPool;

/**
 * В этом классе показан простой пример
 * применения класса RecursiveTask.
 *
 * @author Ломовской К.Ю.
 * @since 19.03.2020
 */
public class RecurTaskDemo {

    public static void main(String[] args) {

        //Создать пул задач
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[5000];

        // Запустить задачи типа ForkJoin. Обратите
        // внимание на то, что в данном случае метод invoke()
        // возвращает рузультат
        for (int i = 0; i < nums.length; i++)
            nums[i] = (((i % 2) == 0) ? i : -i);

        Sum task = new Sum(nums, 0, nums.length);

        double summation = fjp.invoke(task);

        System.out.println("Сумма: " + summation);
    }
}
