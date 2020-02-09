package chapter20.TTest;

import java.util.Timer;

/**
 * Класс демонстрирующий применение
 * класса Timer и TimerTask.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class TTest {

    public static void main(String[] args) {

        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

        // Установить первоначальную паузу в течении одной
        // секунды, а затем повтарять задание каждый полсекунды
        myTimer.schedule(myTask, 1000, 500);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException ignored){}

        myTimer.cancel();
    }
}
