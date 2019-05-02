package chapter7.passob;

/**
 * Программа демонстрирующая,
 * передачу объекта в качестве параметра.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
public class PassOb {

    public static void main(String[] args) {
        Test obj1 = new Test(100, 22);
        Test obj2 = new Test(100, 22);
        Test obj3 = new Test(-1, -1);

        System.out.println("obj1 == obj2: " + obj1.equalTo(obj2));
        System.out.println("obj1 == obj3: " + obj1.equalTo(obj3));
    }
}
