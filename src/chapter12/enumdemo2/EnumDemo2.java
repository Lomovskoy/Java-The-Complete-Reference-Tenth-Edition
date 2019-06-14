package chapter12.enumdemo2;

/**
 * Программа демонстрирующая,
 * перечисленияе сортов яблок.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class EnumDemo2 {

    public static void main(String[] args) {

        Apple ap;
        System.out.println("Константы перечисляемого типа Apple");

        // Применить метод values()
        Apple[] allApples = Apple.values();

        for (Apple a: allApples)
            System.out.println(a);

        System.out.println();

        // применить тип valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
}
