package chapter9.testinterfase;

/**
 * Программа демонстрирующая,
 * частичную реализацию интерфейса.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public abstract class Incomplite implements Callback{

    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }

    // ...
}
