package chapter9.callback;

/**
 * Программа демонстрирующая,
 * реализацию интерфейса.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class Client implements Callback{

    // Реализовать метод интерфейся Callback
    @Override
    public void callback(int param) {
        System.out.println("Метод callback()б вызываемый со значением " + param);
    }

    void nonInterface(){
        System.out.println("В классах реализующих интерфейсы, могут определяться и другие методы");
    }
}
