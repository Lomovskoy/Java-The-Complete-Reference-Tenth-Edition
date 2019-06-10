package chapter9.iftest2;

/**
 * Программа демонстрирующая, реализацию для
 * стека целочисленного фиксированного длинны.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class IFTest {

    public static void main(String[] args) {

        FixedStack myStask1 = new FixedStack(5);
        FixedStack myStask2 = new FixedStack(8);

        // Разместить числа в стеке
        for (int i = 0; i < 5; i++)
            myStask1.push(i);
        for (int i = 0; i < 8; i++)
            myStask2.push(i);

        // Извлесь эти числа из стека
        System.out.println("Стек в myStask1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStask1.pop());

        System.out.println("Стек в myStask2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(myStask2.pop());
    }
}
