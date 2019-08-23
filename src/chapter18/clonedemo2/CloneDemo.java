package chapter18.clonedemo2;

/**
 * Класс демонстрирующий переопределение метода clone().
 *
 * @author Ломовской К.Ю.
 * @since 23.08.2019
 */
class CloneDemo {

    public static void main(String[] args) {

        TestClone x1 = new TestClone();
        TestClone x2;

        x1.a = 10;
        x1.b = 20.98;

        // Клонировать объект x1
        x2 = (TestClone) x1.clone();

        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}
