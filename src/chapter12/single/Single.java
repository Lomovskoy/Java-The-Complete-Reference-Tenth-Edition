package chapter12.single;

import java.lang.reflect.Method;

/**
 * Программа демонстрирующая,
 * одночленной аннотации.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
public class Single {

    // Анньтировать метод одночленной анотации
    @MySigne(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySigne anno = m.getAnnotation(MySigne.class);
            // Выведет значение 100
            System.out.println(anno.value());
        }catch (NoSuchMethodException ex){
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
