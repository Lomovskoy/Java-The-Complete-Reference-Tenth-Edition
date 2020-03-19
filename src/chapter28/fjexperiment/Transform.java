package chapter28.fjexperiment;

import java.util.concurrent.RecursiveAction;

/**
 * В этом классе ForkJoin преобразует (через класс RecursiveAction)
 * значени элементов массива типа double.
 *
 * @author Ломовской К.Ю.
 * @since 19.03.2020
 */
public class Transform extends RecursiveAction {

    // Порог последовательного выполнения,
    // устанавливаемый конструктором
    int seqThreshold;

    // Обрабатываемый массив
    double[] data;

    // Определить часть обрабатываемых данных
    int start, end;

    Transform(double[] vals, int s, int e, int t){
        this.data = vals;
        this.start = s;
        this.end = e;
        this.seqThreshold = t;
    }

    // Этот метод выполняет паралельные вычисления
    @Override
    protected void compute() {

        // Выполнить обработку последовательно, если
        // количество элементов ниже порогового
        if ((end - start) < seqThreshold){
            /*
                В следующем фрагменте кода элементу по чётному
                индексу присваивается квадратный корень его
                первоначального значения, а элементу по нечётному
                индексу - кубическийц корень его первоначального значения.
                Этот код предназначен только джля потребления времени ЦП,
                что бы сделать нагляднее фээект от параллельного вычисления
             */
            for (int i = start; i < end; i++){
                if (data[i] % 2 == 0)
                    data[i] = Math.sqrt(data[i]);
                else
                    data[i] = Math.cbrt(data[i]);
            }
        }
        // Если нет разделить элементы на меньшие части
        else {

            // Найти середину
            int middle = (start + end) / 2;

            // Запустить новые подзадачи на выподлнение,
            // используя разделённые на части данные
            invokeAll(
                    new Transform(data, start, middle, seqThreshold),
                    new Transform(data, start, middle, seqThreshold)
            );
        }

    }
}
