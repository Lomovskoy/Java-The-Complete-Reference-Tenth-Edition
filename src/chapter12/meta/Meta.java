package chapter12.meta;

import java.lang.reflect.Method;

/**
 * Программа демонстрирующая, удержание класса
 * MyAnnoRun со степенью сохранности RUNTIME.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
class Meta {

    // Аннотируем метод

    @MyAnno(atr = "Прмер аннотации", val = 100)
    public static void myMeth() {

        Meta ob = new Meta();

        // Получить анотацию из метода
        // и вывести значения ее членов
        try {
            // Сначала получить объект типа Class,
            // представляющий данный класс
            Class<?> c = ob.getClass();

            // Затем получить объект типа Method,
            // представляющий объект типа метод
            Method m = c.getMethod("myMeth");

            // Далее поулчим аннотацию этого метода
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // И наконец, ваыведем значения членов аннотации
            System.out.println(anno.atr() + " " + anno.val());
        }catch (NoSuchMethodException ex){
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
