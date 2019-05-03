package chapter7.passobjre;

/**
 * Программа демонстрирующая,
 * передачу аргументов по ссылке.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
public class PassObjRE {

    public static void main(String[] args) {

        Test2 ob = new Test2(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}
