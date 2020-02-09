package chapter20;

import java.util.Random;

/**
 * Класс демонстрирующий генерерование случайных
 * чисел с нормальным распеределением.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class RandomDemo {

    public static void main(String[] args) {

        Random random = new Random();
        double val;
        double sum = 0;
        int[] bell = new int[10];

        for (int i = 0; i < 100; i++){
            val = random.nextGaussian();
            sum += val;
            double t = -2;

            for (int x = 0; x < 10; x++, t += 0.5){
                if (val < t){
                    bell[x]++;
                    break;
                }
            }
        }

        System.out.println("Среднее всех значений: " + (sum/100));

        // Вывести кривую распределения
        for (int i = 0; i < 10; i++){
            for (int x = bell[i]; x > 0; x--)
                System.out.print("*");
            System.out.println();
        }
    }
}
