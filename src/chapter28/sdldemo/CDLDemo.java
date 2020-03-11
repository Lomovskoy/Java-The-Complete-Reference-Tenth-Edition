package chapter28.sdldemo;

import java.util.concurrent.CountDownLatch;

/**
 * В этой программе демонстрируется
 * применение класса CountDownLatch.
 *
 * @author Ломовской К.Ю.
 * @since 11.03.2020
 */
public class CDLDemo {

    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("Запуск потока исполнения");
        new Thread(new MyTread(cdl)).start();

        try {
            cdl.await();
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Завершение потока исполнения");
    }
}
