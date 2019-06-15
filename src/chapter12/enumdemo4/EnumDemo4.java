package chapter12.enumdemo4;

/**
 * Программа демонстрирующая, применение методов
 * oridinal(), compareTo(), equals().
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
public class EnumDemo4 {

    public static void main(String[] args) {

        Apple ap, ap2, ap3;

        // Получить все порядковые значения с помощью метода ordinal()
        System.out.println("Все констуанты сортов яблок и их порядковые номера");

        for (Apple a: Apple.values())
            System.out.println(a + " " + a.ordinal());

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        // Продемонстрирорвать применение
        // методов compareTo(), equals().

        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " предшествует " + ap3);

        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " предшествует " + ap);

        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " равно " + ap3);

        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Ошибка!");

        if (ap.equals(ap3))
            System.out.println(ap + " равно " + ap3);

        if (ap == ap3)
            System.out.println(ap + " == " + ap3);
    }

}
