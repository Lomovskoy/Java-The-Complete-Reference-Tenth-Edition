package chapter12;

/**
 * Программа демонстрирующая, автоупаковку и автораспаковку
 * в сочетании с автоматическим привелением и проеобразхованием типов.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
public class AutoBox4 {

    public static void main(String[] args) {

        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb после выражения: " + dOb);

    }
}
