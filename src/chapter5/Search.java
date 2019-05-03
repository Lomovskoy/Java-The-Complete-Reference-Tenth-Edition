package chapter5;

/**
 * Программа демонстрирующая,
 * поиск в массиве с применением цикла for в тиле for each.
 *
 * @author Ломовской К.Ю.
 * @since 22.04.2019
 */
class Search {

    public static void main(String[] args) {

        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Использовать цикл for в тиле for each для
        // поиска значения val в массиве num
        for (int x: nums){
            if (x == val){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найденно!");
    }
}
