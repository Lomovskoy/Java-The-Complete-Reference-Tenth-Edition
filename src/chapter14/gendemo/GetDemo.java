package chapter14.gendemo;

/**
 * Программа демонстрирующая,
 * применение обощённого класса.
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class GetDemo {

    public static void main(String[] args) {
        // Созхдать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;
        // Создать объект типа Gen<Integer> и присвоить ссылку на
        // негопеременной iOb. Обратите внимание на переменыне автоупаковки
        // для инкапсуляции значения 88 в объекте типа Integer
        iOb = new Gen<Integer>(88);
        // Показать тип данных, хранящейся в переменной iOb
        iOb.showType();
        // Полчить значение переменной iOb. Обратите внимание на то,
        // что для этого не требуется никакого присведение типов.
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();
        // Созхдать ссылку типа Gen для символьных строк
        Gen<String> strOb = new Gen<String>("Текст сообщения");
        // Показать тип данных, хранящейся в переменной strOb
        strOb.showType();
        // Полчить значение переменной strOb. Обратите внимание на то,
        // что для этого не требуется никакого присведение типов.
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}