package chapter28.recurtaskdemo;

import java.util.concurrent.RecursiveTask;

/**
 * В этом классе RecursiveTask осуществляется сложение
 * значени элементов массива типа double и возвращается.
 *
 * @author Ломовской К.Ю.
 * @since 19.03.2020
 */
public class Sum extends RecursiveTask<Double> {

    // Пороговое значение проследовательного выполнения
    final int seqThresHold = 500;

    // Обрабатываемый массив
    double[] data;

    // Определить часть обрабатываемых данных
    int start, end;

    public Sum(double[] vals, int s, int e) {
        this.data = vals;
        this.start = s;
        this.end = e;
    }

    // Определить сумму значений элементов массива типа double
    @Override
    protected Double compute() {

        double sum = 0;

        // Выполнить обработку последовательно, если
        // количество элементов ниже порогового
        if ((end - start) < seqThresHold){
            // Сумировать значения элементов в массиве типа double
            for(int i = 0; i < end; i++)
                sum += data[i];
        }
        // Если нет разделить элементы на меньшие части
        else {

            // Найти середину
            int middle = (start + end) / 2;

            // Запустить новые подзадачи на выподлнение,
            // используя разделённые на части данные
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);

            // Запустить каждую задачу путём разветвления
            subTaskA.fork();
            subTaskB.fork();

            // Ожидать завершения каждой задачи и сложить результат
            sum = subTaskA.join() + subTaskB.join();
        }

        // Возвратить сумму
        return sum;
    }
}
