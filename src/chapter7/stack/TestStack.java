package chapter7.stack;

/**
 * Программа демонстрирующая, создание целочисленного стека - где можно
 * храниеть до 10 целочисленных значений, с модификаторами доступа.
 *
 * @author Ломовской К.Ю.
 * @since 04.05.2019
 */
public class TestStack {

    public static void main(String[] args) {

        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // Разместить значения в стеке
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        // Извлеч значения из стека
        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());

        // Эти операторы недоступны
        // myStack1.tos = 2;
        // myStack2.stck[3] = 100;
    }
}
