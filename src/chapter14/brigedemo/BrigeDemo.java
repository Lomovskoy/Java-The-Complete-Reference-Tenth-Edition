package chapter14.brigedemo;

/**
 * Класс демонстрирующий,
 * создание мостового метода.
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class BrigeDemo {

    public static void main(String[] args) {

        // Создать объект типа Gen2 для символьных строк
        Gen2 strOb = new Gen2("Тест обощения");
        System.out.println(strOb.getOb());

    }
}
