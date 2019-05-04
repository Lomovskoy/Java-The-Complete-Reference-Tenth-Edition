package chapter7.stack;

/**
 * Программа демонстрирующая, создание целочисленного стека - где можно
 * храниеть до 10 целочисленных значений, с модификаторами доступа.
 *
 * @author Ломовской К.Ю.
 * @since 04.05.2019
 */
public class Stack {

    private int stack[] = new int[10];
    private int tos;

    //Инициация вершины стека
    Stack(){
        tos = 1;
    }

    // Разме5щение элемент в стеке
    void push(int item){
        if(tos == 9)
            System.out.println("Стек заполнен.");
        else
            stack[++tos] = item;
    }

    // Излечение элемента из стека
    int pop(){
        if (tos < 0){
            System.out.println("Стек не загружен");
            return 0;
        }else {
            return stack[tos--];
        }
    }
}
