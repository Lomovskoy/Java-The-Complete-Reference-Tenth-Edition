package chapter28.phaserdemo;

import java.util.concurrent.Phaser;

/**
 * В этой программе демонстрируется поток исполнения,
 * использующий синхронизатор фаз типа Phaser.
 *
 * @author Ломовской К.Ю.
 * @since 13.03.2020
 */
public class MyThread implements Runnable {

    Phaser phaser;
    String name;

    public MyThread(Phaser p, String n) {
        this.phaser = p;
        this.name = n;
        phaser.register();
    }

    @Override
    public void run() {

        System.out.println("Поток " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance(); // Известить о достижении фазы

        // Небольшая пауза, что бы не нарушить порядок ввода.
        // Это сделано только для целей демонстрции, но
        // совсем не обязательно для правильного
        // функционирования синхронизатора фаз
         try {
             Thread.sleep(10);
         } catch (InterruptedException e){
             System.out.println(e);
         }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance(); // Известить о достижении фазы

        // Небольшая пауза, что бы не нарушить порядок ввода.
        // Это сделано только для целей демонстрции, но
        // совсем не обязательно для правильного
        // функционирования синхронизатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phaser.arriveAndAwaitAdvance(); // Известить о достижении фазы
                                        // и снять потоки с регистрации
    }
}
