package chapter28.semdemo;

import java.util.concurrent.Semaphore;

/**
 * В этой программе демонстрируется
 * применение класа симафор.
 *
 * @author Ломовской К.Ю.
 * @since 10.03.2020
 */
public class SemDemo {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);

        new IncTread(sem, "A").run();
        new DecThread(sem, "B").run();
    }
}
