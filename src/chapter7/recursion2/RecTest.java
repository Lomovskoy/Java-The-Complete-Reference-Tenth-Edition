package chapter7.recursion2;

/**
 * Программа демонстрирующая,
 * ещё один пример пример рекурсии.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
class RecTest {

    int values[];

    RecTest(int i){
        values = new int[i];
    }

    // Вывести рекуурсивно элементы массива
    void printArray(int i){
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
