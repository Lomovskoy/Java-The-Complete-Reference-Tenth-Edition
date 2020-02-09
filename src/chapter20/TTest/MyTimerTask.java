package chapter20.TTest;

import java.util.TimerTask;

/**
 * Класс демонстрирующий применение
 * класса Timer и TimerTask.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class MyTimerTask extends TimerTask {

    public void run() {
        System.out.println("Задание выполняется по таймеру");
    }
}
