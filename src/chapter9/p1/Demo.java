package chapter9.p1;

/**
 * Программа демонстрирующая, пример получения
 * экземпляров различных классов из пакета р1.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class Demo {

    public static void main(String[] args) {

        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePakage ob3 = new SamePakage();
    }
}
