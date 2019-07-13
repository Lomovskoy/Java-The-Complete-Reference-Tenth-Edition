package chapter14.genifdemo;

/**
 * Реализация обощённого интерфейса
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class GetIfDemo {

    public static void main(String[] args) {

        Integer[] iNums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MinMaxImpl<Integer> iOb = new MinMaxImpl<Integer>(iNums);
        MinMaxImpl<Character> cOb = new MinMaxImpl<Character>(chs);

        System.out.println("Максимальное значение массива iNums: " + iOb.max());
        System.out.println("Минимальное значение массива iNums: " + iOb.min());

        System.out.println("Максимальное значение массива chs: " + cOb.max());
        System.out.println("Минимальное значение массива chs: " + cOb.min());

    }

}
