package chapter15.lambdaexceptiondemo;

/**
 * Класс демонстрирующий генерацию
 * исключения в люмбда-выражении.
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
class LambdaExceptionDemo {

    public static void main(String[] args) throws EmptyArrayException {

        double[] values = {1.0, 2.0, 3.0, 4.0};

        // В этом лямбда-выражении вычисляется среднее
        // числовых значений типа double в массиве.
        DoubleNumericArreyFunc average = (n) -> {
            double summ = 0;

            if (n.length == 0)
                throw new EmptyArrayException();

            for (int i = 0; i < n.length; i++)
                summ += n[i];

            return summ / n.length;
        };

        System.out.println("Среднее равно " + average.func(values));

        // Эта строка кода приведёт к генерации исключения.
        System.out.println("Среднее равно " + average.func(new double[0]));
    }
}
