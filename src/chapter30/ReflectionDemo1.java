package chapter30;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * В этой программе демонстрируется
 * применение рефлексии.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class ReflectionDemo1 {

    public static void main(String[] args) {

        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("Кострукторы: ");
            Constructor[] constructors = c.getConstructors();

            for (Constructor constructor : constructors) {
                System.out.println(" " + constructor);
            }

            System.out.println("Поля: ");
            Field[] fields = c.getFields();

            for (Field field: fields){
                System.out.println(" " + field);
            }

            System.out.println("Методы: ");
            Method[] methods = c.getMethods();

            for (Method method : methods){
                System.out.println(" " + method);
            }

        } catch (Exception e){
            System.out.println("Исключение: " + e);
        }
    }
}
