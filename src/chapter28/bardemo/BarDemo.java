package chapter28.bardemo;

import java.util.concurrent.CyclicBarrier;

/**
 * В этой программе демонстрируется
 * применение класса CyclicBarrier.
 *
 * @author Ломовской К.Ю.
 * @since 11.03.2020
 */
public class BarDemo {

    public static void main(String[] args) {

        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("Запуск потоков");

        new Thread(new MyTread(cb, "A")).start();
        new Thread(new MyTread(cb, "B")).start();
        new Thread(new MyTread(cb, "C")).start();
    }
}
