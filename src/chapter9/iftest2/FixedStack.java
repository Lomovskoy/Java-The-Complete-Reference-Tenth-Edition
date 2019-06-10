package chapter9.iftest2;

/**
 * Программа демонстрирующая, реализацию для
 * стека целочисленного фиксированного длинны.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public class FixedStack implements IntStack{

    private int stck[];
    private int tos;

    // Выделить память и инициализировать стек
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }

    // Разместить элемент в стеке
    public void push(int item) {
        if (tos == stck.length - 1) // Использовать поле длинный стека
            System.out.println();
        else
            stck[++tos] = item;
    }

    // Извлечь элемент из стека
    public int pop() {
        if (tos < 0){
            System.out.println("Стек не загружен");
            return 0;
        }else
            return stck[tos--];
    }
}
