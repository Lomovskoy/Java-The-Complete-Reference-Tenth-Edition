package chapter37;

import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * В этой программе демонстрируются
 * свойства и события.
 *
 * @author Ломовской К.Ю.
 * @since 05.05.2020
 */
public class IntrospectorDemo {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("chapter37.Colors");
            BeanInfo beanInfo = Introspector.getBeanInfo(c);

            System.out.println("Свойства: ");
            PropertyDescriptor[] propertyDescriptor = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor descriptor : propertyDescriptor) {
                System.out.println("\t" + descriptor.getName());
            }

            System.out.println("События: ");
            EventSetDescriptor[] eventSetDescriptor = beanInfo.getEventSetDescriptors();

            for (EventSetDescriptor setDescriptor : eventSetDescriptor) {
                System.out.println("\t" + setDescriptor.getName());
            }
        } catch (Exception e){
            System.out.println("Перехвачено событие. " + e);
        }
    }
}
