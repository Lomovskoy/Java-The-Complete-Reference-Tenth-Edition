package chapter28.semdemo;

import java.util.concurrent.Semaphore;

/**
 * Класа демонстрирующий поток исполнения
 * уменьшающий значения счётчика на единицу.
 *
 * @author Ломовской К.Ю.
 * @since 10.03.2020
 */
public class DecThread implements Runnable {
    String name;
    Semaphore sem;

    public DecThread(Semaphore s, String n) {
        this.name = n;
        this.sem = s;
    }

    @Override
    public void run() {

        System.out.println("Запуск потока " + name);

        try {
            // Сначала получаем разрешение
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешения");
            // Теперь получаем доступ к общему ресурсу
            for (int i = 0; i < 5; i++){
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                // Разрешить если возможно переключение контекста
                Thread.sleep(10);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }

        // Освободить разрешение
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();

    }
}
