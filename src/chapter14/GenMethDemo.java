package chapter14;

/**
 * Класс демонстрирующий простой обощённый метод
 *
 * @author Ломовской К.Ю.
 * @since 06.07.2019
 */
class GenMethDemo {

    // Определить, сордержится ли объект в массиве
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {

        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i])) return true;

        return false;
    }

    public static void main(String[] args) {

        // Применить мтод isIn() для целых чисел
        Integer[] nums = {1, 2, 3, 4, 5};

        if (isIn(2, nums))
            System.out.println("Число 2 содержится в массиве nums");
        if (!isIn(7, nums))
            System.out.println("Число 7 отсутствует в массиве nums");
        System.out.println();

        // Применить метод isIn() для символьных строк
        String[] strs = {"один", "два", "три", "четыре", "пять"};

        if (isIn("два", strs))
            System.out.println("Число два содержится в массиве strs");
        if (!isIn("семь", strs))
            System.out.println("Число семь отсутствует в массиве strs");

        // Следующий код не скомпилируется типы данных не совместимы
        //if (!isIn("семь", nums))
        //    System.out.println("Число семь отсутствует в массиве nums");
    }
}
