package chapter7.stack2;

/**
 * Программа демонстрирующая, создание целочисленного стека -
 * в котором используется свойство длинны массива.
 *
 * @author Ломовской К.Ю.
 * @since 04.05.2019
 */
public class TestStack {

    public static void main(String[] args) {

        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        // Разместить значения в стеке
        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        // Извлеч значения из стека
        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());

    }
}
