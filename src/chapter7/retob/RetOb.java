package chapter7.retob;

/**
 * Программа демонстрирующая, возврат объекта.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
class RetOb {

    public static void main(String[] args) {

        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();

        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увелисения значения: " + ob2.a);
    }

}