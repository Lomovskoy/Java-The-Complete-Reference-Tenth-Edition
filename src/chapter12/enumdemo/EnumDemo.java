package chapter12.enumdemo;

/**
 * Программа демонстрирующая,
 * перечисленияе сортов яблок.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class EnumDemo {

    public static void main(String[] args) {

        Apple ap;
        ap = Apple.RedDel;

        // Вывести значение перечисляемого типа
        System.out.println("Значение Ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // Сравнить два значения перечисляемого типа
        if (ap == Apple.GoldenDel)
            System.out.println("Переменная ap содержит GoldenDel.\n");

        // Применить перечисления для управления оператором switch
        switch (ap){
            case Jonathan:
                System.out.println("Сорт Jonathan");
                break;
            case GoldenDel:
                System.out.println("Сорт GoldenDel");
                break;
            case RedDel:
                System.out.println("Сорт RedDel");
                break;
            case Winesap:
                System.out.println("Сорт Winesap");
                break;
            case Cortland:
                System.out.println("Сорт Cortland");
                break;
        }
    }
}
