package chapter28.phaserdemo2;

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

        while (!phaser.isTerminated()){
            System.out.println("Поток " + name + " начинает фазу " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();

            // Небольшая пауза, что бы не нарушить порядок ввода.
            // Это сделано только для целей демонстрции, но
            // совсем не обязательно для правильного
            // функционирования синхронизатора фаз
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
