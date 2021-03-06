package chapter9.testinterfase;

/**
 * Программа демонстрирующая,
 * реализацию интерфейса.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class Client implements Callback{

    // Реализовать метод интерфейся Callback
    @Override
    public void callback(int param) {
        System.out.println("Метод callback() вызываемый со значением " + param);
    }

    void nonInterface(){
        System.out.println("В классах реализующих интерфейсы, могут определяться и другие методы");
    }
}
