package chapter28.callabledemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * В этой программе демонстрируется
 * применение интерфейса Callable.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class CallableDemo {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f1;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Запуск");

        f1 = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3, 4));
        f3 = es.submit(new Factorial(5));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException ex){
            System.out.println(ex);
        } catch (ExecutionException ex){
            System.out.println(ex);
        }

        es.shutdown();
        System.out.println("Завершение");
    }
}
