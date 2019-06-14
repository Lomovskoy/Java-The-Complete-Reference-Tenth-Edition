package chapter11.suspendresume;

/**
 * Программа демонстрирующая, приостановку и
 * возобновления потока с помошью переменной флаг.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class NewThread implements Runnable{

    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start();
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 15; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершён.");
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
}
