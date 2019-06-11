package chapter9;

/**
 * Программа демонстрирующая, очередную версию интерфейса IntStack
 * с закрытым методом применяемым в двух реализуемых по умолчанию методах.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public interface IntStack {

    // Сохранить элемент в стеке
    void push(int item);

    // Извлечь элемент из стека
    int pop();

    // Метод с реализацией по умолчанию, возвращающий
    // массив из n элементов, начиная с вершины стека
    default int[] popNElements(int n){
        return getElements(n);
    }

    // Метод с реализацией по умолчанию, возвращающий
    // массив из n элементов, следующий после
    // указанного количества пропускаемых элементов
    default int[] skipAndPopElemens(int skip, int n){
        // Пропустить указанные количество элементов в стеке
        getElements(skip);
        // Возвратить запрашиваемые элементы из стека
        return getElements(n);
    }

    // Закрытый метод, возваращающий массив из n элементов,
    // начиная с вершины стекака
    private int[] getElements(int n){
        int[] elements = new int[n];
        for (int i = 0; i < n; i++)
            elements[i] = pop();
        return elements;
    }
}
