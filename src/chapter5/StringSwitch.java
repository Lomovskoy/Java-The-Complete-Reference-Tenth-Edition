package chapter5;

/**
 * Программа демонстрирующая, использование символьной
 * строки для управления оператором Switch.
 *
 * @author Ломовской К.Ю.
 * @since 11.04.2019
 */
public class StringSwitch {

    public static void main(String[] args) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
            default:
                System.out.println("Не совпало");
        }
    }
}
