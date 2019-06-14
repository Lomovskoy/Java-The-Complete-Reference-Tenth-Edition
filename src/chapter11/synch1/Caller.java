package chapter11.synch1;

/**
 * Программа демонстрирующая,
 * синхронизированный бок кода.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class Caller implements Runnable{

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
