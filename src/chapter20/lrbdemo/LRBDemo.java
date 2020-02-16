package chapter20.lrbdemo;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Класс демонстрирующий использование
 * комплектов ресурсов.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class LRBDemo {

    public static void main(String[] args) {

        // Загрузить комплект ресурсов по умолчанию
        ResourceBundle resourceBundle = ResourceBundle.getBundle("chapter20.lrbdemo.SampleRB");

        System.out.println("Английская версия программы: ");
        System.out.println("Строка по ключу Title: " + resourceBundle.getString("title"));
        System.out.println("Строка по ключу StopText: " + resourceBundle.getString("StopText"));
        System.out.println("Строка по ключу StartText: " + resourceBundle.getString("StartText"));

        // Загрузить комплект ресурсов для поддержки
        // немецкого языка
        resourceBundle = ResourceBundle.getBundle("chapter20.lrbdemo.SampleRB_de", Locale.GERMAN);

        System.out.println("\nНемецкая версия программы: ");
        System.out.println("Строка по ключу Title: " + resourceBundle.getString("title"));
        System.out.println("Строка по ключу StopText: " + resourceBundle.getString("StopText"));
        System.out.println("Строка по ключу StartText: " + resourceBundle.getString("StartText"));
    }
}
