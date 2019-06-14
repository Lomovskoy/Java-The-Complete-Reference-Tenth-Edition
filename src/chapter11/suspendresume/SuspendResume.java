package chapter11.suspendresume;

/**
 * Программа демонстрирующая, приостановку и
 * возобновления потока с помошью переменной флаг.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class SuspendResume {

    public static void main(String[] args) {

        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Возобновления потока Один");
            ob2.mySuspend();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Возобновления потока Два");
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }

        try {
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершён");
    }
}
