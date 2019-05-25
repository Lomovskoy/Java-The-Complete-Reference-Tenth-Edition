package chapter8;

/**
 * Программа демонстрирующая, просто пример наследования.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
public class SimpleInheritance {

    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        // Супер класс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        // Подкласс имеет доступ ко всем открытым членам своего суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb: ");
        subOb.sum();
    }
}
