package chapter11.deadlock;

/**
 * Программа демонстрирующая,
 * взаимную блокировку.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class B {

    synchronized void bar(A a){

        String name = Thread.currentThread().getName();
        System.out.println(name + " вошёл в метод B.bar()");

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Класс B прерван");
        }

        System.out.println(name + " пытвется вызвать метод A.last()");

        a.last();
    }

    synchronized void last(){
        System.out.println("В методе B.last()");
    }
}
