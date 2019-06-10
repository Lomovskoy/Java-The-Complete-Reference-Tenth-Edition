package chapter9.p1;

/**
 * Программа демонстрирующая,
 * пример доступа к пакетам.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class Protection {

    int n = 1;
    private int nPri = 2;
    protected int nPro = 3;
    public int nPub = 4;

    public Protection(){
        System.out.println("Конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("nPri = " + nPri);
        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
