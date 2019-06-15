package chapter12.enumdemo3;

/**
 * Программа демонстрирующая, использование конструктора
 * переменную эекземпляра, и метод перечисления.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class EnumDemo3 {

    public static void main(String[] args) {

        Apple ap;

        // Вывести цену на на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит "
                + Apple.Winesap.getPrice() + " центов.");

        // Вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок");
        for (Apple a: Apple.values())
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
    }
}
