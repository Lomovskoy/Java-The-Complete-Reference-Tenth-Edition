package chapter12.meta3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Программа демонстрирующая, получения всех
 * анотаций для класса и метода с посошью рефлекции.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {

    @What(description = "Аннотация тестового метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation[] annos = ob.getClass().getAnnotations();

            // Вывести все аннотации для класса Meta2
            System.out.println("Вывести все аннотации для класса Meta2: ");
            for (Annotation a: annos)
                System.out.println(a);

            System.out.println();

            // Вывести все аннотации для метода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("Вывести все аннотации для метода myMeth(): ");
            for (Annotation a: annos)
                System.out.println(a);
        }catch (NoSuchMethodException ex){
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
