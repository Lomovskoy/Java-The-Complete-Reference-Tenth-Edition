package chapter7.stack2;

/**
 * Программа демонстрирующая, усовершенствованный класс Stack,
 * в котором используется свойство длинны массива.
 *
 * @author Ломовской К.Ю.
 * @since 04.05.2019
 */
class Stack {

    private int stack[];
    private int tos;

    // Выделить память под стек и инициализировать его
    Stack(int size){
        stack = new int[size];
        tos = -1;
    }

    // Разме5щение элемент в стеке
    void push(int item){
        if(tos == stack.length - 1)
            // Использовать свойство длинны массива
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
