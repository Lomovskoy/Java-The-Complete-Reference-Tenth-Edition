package chapter14.simpgen;

/**
 * Программа демонстрирующая, простой
 * обощённый класс с двумя параметрами типа: T, V.
 *
 * @author Ломовской К.Ю.
 * @since 26.06.2019
 */
class SimpGen {

    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обощения");

        // Показать типы
        tgObj.showTypes();

        // Получить и показать значения
        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }

}
