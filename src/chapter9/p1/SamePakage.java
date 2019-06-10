package chapter9.p1;

/**
 * Программа демонстрирующая,
 * пример доступа к пакетам.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class SamePakage {

    SamePakage(){

        Protection p = new Protection();
        System.out.println("Конструктор из того же самого пакета");
        System.out.println("n = " + p.n);

        // Доступно только для класса
        // System.out.println("nPri = " + p.nPri);

        System.out.println("nPro = " + p.nPro);
        System.out.println("nPub = " + p.nPub);
    }
}
