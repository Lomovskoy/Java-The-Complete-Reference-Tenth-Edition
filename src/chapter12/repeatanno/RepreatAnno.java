package chapter12.repeatanno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Программа демонстрирующая,
 * применение повторяющихся аннотаций.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
public class RepreatAnno {

    // Повторить аннотацию MyAnno в методе myMeth()
    @MyAnno(str = "Первая аннотация", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth() {
        RepreatAnno ob = new RepreatAnno();
        try {
            Class<?> c = ob.getClass();

            // Получить аннотации для метода myMeth
            Method m = c.getMethod("myMeth", String.class, int.class);

            // Вывести повторяющиеся аннотации
            Annotation anno = m.getAnnotation(MyRepreatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException ex){
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
