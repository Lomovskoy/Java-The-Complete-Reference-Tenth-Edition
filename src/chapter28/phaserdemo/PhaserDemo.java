package chapter28.phaserdemo;

import java.util.concurrent.Phaser;

/**
 * В этой программе демонстрируется класс Phaser.
 *
 * @author Ломовской К.Ю.
 * @since 13.03.2020
 */
public class PhaserDemo {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");

        new Thread(new MyThread(phaser, "A")).start();
        new Thread(new MyThread(phaser, "B")).start();
        new Thread(new MyThread(phaser, "C")).start();

        // Ожидать завершения всеми потоками первой фазы
        curPhase = phaser.getPhase() + 1;
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // Ожидать завершения всеми потоками второй фазы
        curPhase = phaser.getPhase() + 1;
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // Ожидать завершения всеми потоками третей фазы
        curPhase = phaser.getPhase() + 1;
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // Снять основной поток исполнения с регистрации
        phaser.arriveAndDeregister();

        if (phaser.isTerminated())
            System.out.println("Синхронизатор фаз завершён");
    }
}
