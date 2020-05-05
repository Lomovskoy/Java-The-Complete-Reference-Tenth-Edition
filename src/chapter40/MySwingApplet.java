// В этой программе демонстрируются
// пример простого Swing апплета.
// @author Ломовской К.Ю.
// @since 05.05.2020
package chapter40;

import javax.swing.*;
import java.awt.*;

/*
    <applet code="MySwingApplet" width=220 height=90>
    </applet>
 */
public class MySwingApplet extends JApplet {
    JButton jbtnAlpha;
    JButton jbtnBeta;

    JLabel jlab;

    // Инициализировать аплет
    @Override
    public void init(){
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch (Exception e){
            System.out.println("Нельзя создать из за исключения указанного типа " + e);
        }
    }

    // В этом аплете не нужно переопределять методы
    // start(), stop(), destroy()

    // Настроить инициализацию GUI
    private void makeGUI(){

        // Установить для аплета диспетчер потоковой компановки
        setLayout(new FlowLayout());

        // Создать две кнопки
        jbtnAlpha = new JButton("Alpha");
        jbtnBeta = new JButton("Beta");

        // Ввести приёмник дей  ствий от кнопки Alpha
        jbtnAlpha.addActionListener(ae -> jlab.setText("Alpha was pressed."));

        // Ввести приёмник дей  ствий от кнопки Beta
        jbtnBeta.addActionListener(ae -> jlab.setText("Beta was pressed."));

        // Ввести кнопки на панель содержимого
        add(jbtnAlpha);
        add(jbtnBeta);

        // Создать текстовую метку
        jlab = new JLabel("Press a button");

        // Ввести метку на панель содержимого
        add(jlab);
    }
}
