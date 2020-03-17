package chapter28.forkjoindemo;

import java.util.concurrent.RecursiveAction;

/**
 * В этой программе демонстрируется
 * простой пример стратегии "разделяй и властвуй".
 * Здесь применяется класс RecursiveAction.
 *
 * @author Ломовской К.Ю.
 * @since 17.03.2020
 */
public class SqrtTransform extends RecursiveAction {

    /*
        В данном примере пороговое значение произвольно
        устанавливается равным 1000. В реальном коде его
        оптимальное значение может быть определено в
        результате профилирования исполняющей системы
        или экспериментально.
     */
    private final int seqThreshold = 1000;

    // Обрабатываемый массив
    private double[] data;

    // Определить часть обарбатываемых данных
    private int start, end;

    SqrtTransform(double[] vals, int s, int e){
        this.data = vals;
        this.start = s;
        this.end = e;
    }

    // Этот метод может выполнять паралельные вычисления
    @Override
    protected void compute() {

        // Если количество элементов меньше порогового значения,
        // выполнить дальнейшую обработку последовательно
        if ((end - start) < seqThreshold){
            // Преобразование значения каждого элемента
            // в его квадратный корень
            for (int i = start; i < end; i++){
                data[i] = Math.sqrt(data[i]);
            }
        }
        // В противном случае разделить
        // данные на меньшие части
        else {
            // Найти середину
            int middle = (start + end) / 2;

            // Запустить новые подзадачи на выполнение,
            // используя разделённые на части данные
            invokeAll(
                    new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end)
            );
        }

    }
}
