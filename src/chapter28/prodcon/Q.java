package chapter28.prodcon;

import java.util.concurrent.Semaphore;

/**
 * В этой программе демонстрируется
 * реализация потавщика и потребителя,
 * использующая симафоры для управления
 * синхронизацией.
 *
 * @author Ломовской К.Ю.
 * @since 10.03.2020
 */
public class Q {
    int n;

    // Начать с недоступного симафора потребителя
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semPod = new Semaphore(1);

    void get(){
        try {
            semCon.acquire();
        } catch (InterruptedException e){
            System.out.println("Перехваченно исключение типа InterruptedException");
        }

        System.out.println("Получено: " + n);
        semPod.release();
    }

    void put(int n){
        try {
            semPod.acquire();
        } catch (InterruptedException e){
            System.out.println("Перехваченно исключение типа InterruptedException");
        }
        this.n = n;
        System.out.println("Отправлено: " + n);
        semCon.release();
    }
}
