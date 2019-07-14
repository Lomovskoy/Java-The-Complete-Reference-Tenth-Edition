package chapter14.genarrays;

/**
 * Класс демонстрирующий, обощения и массивы.
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class GenArrays {

    public static void main(String[] args) {

        Integer[] n = {1, 2, 3, 4, 5};

        Gen<Integer> iOb = new Gen<Integer>(50, n);

        // Нельзя создать массив специфических для
        // типа обощённых ссылок
        // Gen<Integer>[] gens = new Gen<Integer>[10];
        Gen<?>[] gens = new Gen<?>[10]; // Это верно
    }
}
