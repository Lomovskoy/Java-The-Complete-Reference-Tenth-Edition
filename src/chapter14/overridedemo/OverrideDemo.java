package chapter14.overridedemo;

/**
 * Класс демонстрирующий,
 * переопределение обощённых методов
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class OverrideDemo {

    public static void main(String[] args) {

        // Создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Создать объект типа Gen2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // Создать объект типа Gen2 для символьных строк
        Gen2<String> strOb2 = new Gen2<String>("Тест обощений");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
