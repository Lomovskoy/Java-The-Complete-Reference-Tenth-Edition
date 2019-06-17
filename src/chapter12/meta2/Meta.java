package chapter12.meta2;

import java.lang.reflect.Method;

/**
 * Программа демонстрирующая, удержание класса
 * MyAnnoRun со степенью сохранности RUNTIME.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
class Meta {

    // Аннотируем метод

    @MyAnno(str = "Два переметра", val = 19)
    public static void myMeth(String str, int i) {

        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            // Здесь укащываем типы параметров
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException ex){
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth("Тест", 10);
    }
}
