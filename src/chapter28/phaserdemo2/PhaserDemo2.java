package chapter28.phaserdemo2;

/**
 * В этой программе демонстрируется асширение класса Phaser
 * и переоределение метода onAdvance() таким образом, чтобы
 * было выполненно только определённое количество фаз.
 *
 * @author Ломовской К.Ю.
 * @since 13.03.2020
 */
public class PhaserDemo2 {

    public static void main(String[] args) {
        MyParser phaser = new MyParser(1, 4);

        System.out.println("Запуск потоков\n");

        new Thread(new MyThread(phaser, "A")).start();
        new Thread(new MyThread(phaser, "B")).start();
        new Thread(new MyThread(phaser, "C")).start();

        // Ожидать завершения определённого количества фаз
        while (!phaser.isTerminated()){
            phaser.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершён");
    }
}
