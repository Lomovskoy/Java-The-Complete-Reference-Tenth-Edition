package chapter18.threadgroupdemo;

/**
 * Класс демонстрирующий применение
 * групп потоков исполненеия.
 *
 * @author Ломовской К.Ю.
 * @since 23.08.2019
 */
class ThreadGroupDemo {

    public static void main(String[] args) {

        ThreadGroup groupA = new ThreadGroup("Группа А");
        ThreadGroup groupB = new ThreadGroup("Группа B");

        NewThread ob1 = new NewThread("Один", groupA);
        NewThread ob2 = new NewThread("Два", groupA);
        NewThread ob3 = new NewThread("Три", groupB);
        NewThread ob4 = new NewThread("Четыре", groupB);

        System.out.println("\nВывод их метода list(): ");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается группа А");
        Thread[] tga = new Thread[groupA.activeCount()];

        // Получить потокисполнения из группы
        groupA.enumerate(tga);

        for (Thread thread : tga) {
            // Приостановить каждый поток исполнения
            ((NewThread) thread).mySuspend();
        }

        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            System.out.println("Главный поток исполненеия прерван.");
        }

        System.out.println("Возобновленна группа А");

        for (Thread thread : tga) {
            // Возобновить каждый поток исполнения
            ((NewThread) thread).myResume();
        }

        // Ожидать завершения потоков исполнения
        try {
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        }catch (Exception e){
            System.out.println("Исключение в главном потоке исполнения");
        }
        System.out.println("Главный поток исполненеия завершён.");
    }
}
