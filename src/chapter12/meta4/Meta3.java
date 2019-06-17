package chapter12.meta4;

import java.lang.reflect.Method;

/**
 * Программа демонстрирующая, получения всех
 * анотаций для класса и метода с посошью рефлекции.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
class Meta3 {

    // Аннотировать метод, используя значение по умолчанию
    @MyAnoDefault()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        // Получить анотацию из метода
        // и вывести значения ее членов
        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnoDefault anno = m.getAnnotation(MyAnoDefault.class);

            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException ex){
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
