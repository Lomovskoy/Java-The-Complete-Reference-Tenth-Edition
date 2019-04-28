package chapter6.Stask;

/**
 * Программа демонстрирующая, создание целочисленного стека -
 * где можно храниеть до 10 целочисленных значений.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
public class Stask {

    int stask[] = new int[10];
    int tos;

    // Инициализация вершины стека
    Stask(){
        tos = -1;
    }

    // Размещение элемента в стеке
    void push(int item){
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stask[++tos] = item;
    }

    // Извлечение элемента из стека
    int pop(){
        if (tos < 0){
            System.out.println("стек не загружен.");
            return 0;
        }else
            return stask[tos--];
    }
}
