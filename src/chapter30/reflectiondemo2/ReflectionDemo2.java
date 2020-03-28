package chapter30.reflectiondemo2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * В этой программе демонстрируется
 * открытых методов.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class ReflectionDemo2 {

    public static void main(String[] args) {

        try {
            A a = new A();
            Class<?> c = a.getClass();

            System.out.println("Открытые методы: ");
            Method[] methods = c.getDeclaredMethods();

            for (int i = 0; i < methods.length; i++){
                int modifiers = methods[i].getModifiers();
                if (Modifier.isPublic(modifiers)){
                    System.out.println(" " + methods[i].getName());
                }
            }
        } catch (Exception e){
            System.out.println("Исключение: " + e);
        }
    }
}
