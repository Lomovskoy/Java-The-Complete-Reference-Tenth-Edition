package chapter20.lrbdemo;

import java.util.ListResourceBundle;

/**
 * Класс демонстрирующий использование
 * комплектов ресурсов.
 *
 * @author Ломовской К.Ю.
 * @since 16.02.2020
 */
public class SampleRB_de extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {

        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "Mein Program";

        resources[1][0] = "StopText";
        resources[1][1] = "Anschlag";

        resources[2][0] = "StartText";
        resources[2][1] = "Anfang";

        return resources;
    }
}
