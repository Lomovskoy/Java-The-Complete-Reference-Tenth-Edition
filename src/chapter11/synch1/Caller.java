package chapter11.synch1;

/**
 * Программа демонстрирующая,
 * синхронизированный бок кода.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
public class Caller implements Runnable{

    String mgs;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        mgs = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            // Синхронизированный блок
            target.call(mgs);
        }
    }
}
