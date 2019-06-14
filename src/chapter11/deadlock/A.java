package chapter11.deadlock;

/**
 * Программа демонстрирующая,
 * взаимную блокировку.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class A {

    synchronized void foo(B b){

        String name = Thread.currentThread().getName();
        System.out.println(name + " вошёл в метод A.foo()");

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Класс A прерван");
        }

        System.out.println(name + " пытается вызвать метод B.last()");
        b.last();

    }

    synchronized void last(){
        System.out.println("В методе A.last()");
    }

}
