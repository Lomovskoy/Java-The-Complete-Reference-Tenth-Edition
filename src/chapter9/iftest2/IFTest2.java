package chapter9.iftest2;

/**
 * Программа демонстрирующая, реализацию для
 * стека целочисленного фиксированного длинны.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class IFTest2 {

    public static void main(String[] args) {

        DynStack myStask1 = new DynStack(5);
        DynStack myStask2 = new DynStack(8);

        // Разместить числа в стеке и увеличить его размер
        for (int i = 0; i < 12; i++)
            myStask1.push(i);
        for (int i = 0; i < 20; i++)
            myStask2.push(i);

        // Извлесь эти числа из стека
        System.out.println("Стек в myStask1: ");
        for (int i = 0; i < 12; i++)
            System.out.println(myStask1.pop());

        System.out.println("Стек в myStask2: ");
        for (int i = 0; i < 20; i++)
            System.out.println(myStask2.pop());
    }
}
