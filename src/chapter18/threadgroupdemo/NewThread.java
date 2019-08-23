package chapter18.threadgroupdemo;

/**
 * Класс демонстрирующий применение
 * групп потоков исполненеия.
 *
 * @author Ломовской К.Ю.
 * @since 23.08.2019
 */
class NewThread extends Thread{

    boolean suspendFlag;

    NewThread(String threadName, ThreadGroup tgOb){
        super(tgOb, threadName);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        // Запустить поток исполнения
        start();
    }

    // Точка входа в поток исполнения
    public void run(){
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Исключение в getName()");
        }
        System.out.println(getName() + " завершается.");
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }

}
