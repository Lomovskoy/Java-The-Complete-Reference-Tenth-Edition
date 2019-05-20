package chapter7;

/**
 * Программа демонстрирующая, создание класса
 * с статическими переменными и методы.
 *
 * @author Ломовской К.Ю.
 * @since 20.05.2019
 */
public class UserStatic {

    static int a = 3;
    static int b;

    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статический блок инициализации");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }

}
