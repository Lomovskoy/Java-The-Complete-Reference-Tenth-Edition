package chapter11.demojoin;

/**
 * Программа демонстрирующая, создание множества потоков
 * исполнения и ожидание их завершения через метод join.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
class DemoJoin {

    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        NewThread ob3 = new NewThread("Три");

        System.out.println("Поток один запущен: " + ob1.t.isAlive());
        System.out.println("Поток два запущен: " + ob2.t.isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());

        // Ожидать исполнения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Поток один запущен: " + ob1.t.isAlive());
        System.out.println("Поток два запущен: " + ob2.t.isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());

        System.out.println("Главный поток завершён.");
    }
}
