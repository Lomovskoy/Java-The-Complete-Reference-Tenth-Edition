package chapter9.iftest2;

/**
 * Программа демонстрирующая,
 * интерфейс для целочисленного стека.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
interface IntStack {
    void push(int item);    // Сохранить элемент в стек
    int pop();              // Извлечь элемент из стека
}
