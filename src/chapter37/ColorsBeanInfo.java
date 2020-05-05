package chapter37;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * В этой программе демонстрируются
 * простой компонент Java Bean.
 *
 * @author Ломовской К.Ю.
 * @since 05.05.2020
 */
public class ColorsBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor[] pd = {rectangular};
            return pd;
        } catch (Exception e){
            System.out.println("Перехвачено событие. " + e);
        }
        return null;
    }
}
