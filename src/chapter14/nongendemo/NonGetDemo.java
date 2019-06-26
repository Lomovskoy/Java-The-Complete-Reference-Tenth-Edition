package chapter14.nongendemo;

/**
 * Программа демонстрирующая,
 * применение обощённого класса.
 *
 * @author Ломовской К.Ю.
 * @since 26.06.2019
 */
class NonGetDemo {

    public static void main(String[] args) {

        NonGen iOb;

        // Создать объект типа NonGen сохранить в нём
        // объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(88);

        // Показать типа данных,хранящейся в переменной iOb
        iOb.showType();

        // Получить значение переменной iOb,
        // на этот раз требуется приведение типов
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // Создать другой объект типа NonGen
        // сохранить в нём объект типа String.
        NonGen strOb = new NonGen("Тест без обощений");

        // Показать типа данных,хранящейся в переменной strOb
        strOb.showType();

        // Получить значение переменной strOb,
        // и в этот раз требуется приведение типов
        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);

        // Этот код скомпилируется, но он принципиально неверен!
        iOb = strOb;

        // Ошибка во времЯ выполнения.
        v = (Integer) iOb.getOb();
    }
}
