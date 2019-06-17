package chapter12.markerannotations;

import java.lang.reflect.Method;

/**
 * Программа демонстрирующая,
 * маркерный аннотации.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
class Marker {

    // Аннотировать метод с помощью маркера
    // обратите внимание на необязательность скобок
    @MyMarker
    public static void myMeth() {

        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            // Определить наличие аннотации
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("Маркерная аннотация Marker присутствует.");
        }catch (NoSuchMethodException ex){
            System.out.println("Метод не найден.");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }

}
