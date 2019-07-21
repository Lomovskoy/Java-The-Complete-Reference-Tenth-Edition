package chapter15.instancemethwithobjectrefdemo;

/**
 * Класс демонстрирующий использование
 * ссылки на метод экземпляра с разными объектами.
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
class InstanceMethWithObjectRefDemo {

    /*
        Метод, возвращающий количество экземпляров объкта,
        найденных по критериям, задаваемым поараметром
        функционального интерфейса MyFunc
     */
    static <T> int cunter(T[] vals, MyFunc<T> f, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v)) count++;

        return count;
    }

    public static void main(String[] args) {

        int count;

        // Создать массив объектов тима HightTemp
        HightTemp[] weekDayHights = {
                new HightTemp(89), new HightTemp(82),
                new HightTemp(90), new HightTemp(89),
                new HightTemp(89), new HightTemp(91),
                new HightTemp(84), new HightTemp(83)
        };

        /*
            Использовать метод counter() вместе с массивами
            объектов типа HightTemp. Обратите внимание на то,
            что ссылка на емтод экземпляра sameTemp()
            передаётся в качества второго параметра.
         */
        count = cunter(weekDayHights, HightTemp::sameTemp, new HightTemp(89));
        System.out.println("Дней когда максимальна температура была 89: " + count);

        // А теперь создать и использоваться с данным
        // методом ещё один массив объектов типа HightTemp
        HightTemp[] weekDayHights2 = {
                new HightTemp(32), new HightTemp(12),
                new HightTemp(24), new HightTemp(19),
                new HightTemp(18), new HightTemp(12),
                new HightTemp(-1), new HightTemp(13)
        };

        count = cunter(weekDayHights2, HightTemp::sameTemp, new HightTemp(12));
        System.out.println("Дней когда максимальна температура была 12: " + count);

        // А теперь воспользоваться методом lessThanTemp(),
        // чтобы выяснить, сколько дней температура была ниже заданной
        count = cunter(weekDayHights, HightTemp::lessThanTemp, new HightTemp(89));
        System.out.println("Дней когда максимальна температура была ниже 89: " + count);

        count = cunter(weekDayHights2, HightTemp::lessThanTemp, new HightTemp(19));
        System.out.println("Дней когда максимальна температура была ниже 19: " + count);
    }
}
