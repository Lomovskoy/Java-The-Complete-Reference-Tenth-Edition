package chapter9.p1;

/**
 * Программа демонстрирующая,
 * пример доступа к пакетам.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class Derived extends Protection{

    Derived(){
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);

        // Доступно только для класса
        // System.out.println("nPri = 4" + nPri);

        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
