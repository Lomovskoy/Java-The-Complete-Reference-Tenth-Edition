package chapter11.synch;

/**
 * Программа демонстрирующая,
 * не синхронизированный потоки.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
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
        target.call(mgs);
    }
}
