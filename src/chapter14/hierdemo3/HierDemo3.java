package chapter14.hierdemo3;

/**
 * Класс демонстрирующий, последствия динамической
 * идентификации типов в иерархии обощённых классов
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class HierDemo3 {

    public static void main(String[] args) {

        // Создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Создать объект типа Gen2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // Создать объект типа Gen2 для символьных строк
        Gen2<String> strOb2 = new Gen2<String>("Текст сообщения");

        // Проверить, является ли объект типа iOb2 какой-нибудь
        // из форм класса Gen2
        if (iOb2 instanceof Gen2<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen2");

        // Проверить, является ли объект типа iOb2 какой-нибудь
        // из форм класса Gen
        if (iOb2 instanceof Gen<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen");
        System.out.println();

        // Проверить, является ли объект типа strOb2 какой-нибудь
        // из форм класса Gen2
        if (strOb2 instanceof Gen2<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen2");

        // Проверить, является ли объект типа strOb2 какой-нибудь
        // из форм класса Gen
        if (strOb2 instanceof Gen<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen");
        System.out.println();

        // Проверить, является ли объект типа iOb какой-нибудь
        // из форм класса Gen2, что совсем не так
        if (iOb instanceof Gen2<?>)
            System.out.println("Объект iOb является экземпляром класса Gen2");

        // Проверить, является ли объект типа iOb какой-нибудь
        // из форм класса Gen2, что так и есть
        if (iOb instanceof Gen<?>)
            System.out.println("Объект iOb является экземпляром класса Gen");

        // Следующий код не скомпилируется, так как
        // сведения об обощённых типах отсутствуют
        //if (iOb2 instanceof Gen2<Integer>)
        //    System.out.println("Объект iOb является экземпляром класса Gen2<Integer>");
    }
}
