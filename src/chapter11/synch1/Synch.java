package chapter11.synch1;

/**
 * Программа демонстрирующая,
 * синхронизированный бок кода.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
public class Synch {

    public static void main(String[] args) {

        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");

        // Ожидать завершенияпотоков исполнения
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Прерванно");
        }
    }
}
