// В этой программе демонстрируются
// скелет апплета.
// @author Ломовской К.Ю.
// @since 05.05.2020
package chapter40;

import java.applet.Applet;
import java.awt.*;

/*
    <applet code="AppletSkel" width=300 height=100>
    </applet>
 */
public class AppletSkel extends Applet {

    // Этот метод вызывается первым
    @Override
    public void init(){
        // Инициализация
    }

    // Этот метод вызывается вторым после init()
    // Вызывется так-же при перезагрузке аплета
    @Override
    public void start() {
        // Начать или возобновить выполнение аплета
    }

    // Этот метод вызывается при остановке аплета
    @Override
    public void stop() {
        // Приостановить выполнение аплета
    }

    // Этот метод вызывается при уничтожении аплета
    // Это последжний вызываемый метод
    @Override
    public void destroy() {
        // Выполнить завершающие действия
    }

    // Этот метод вызывается, когда окно аплета
    // должно быть восстановленно
    @Override
    public void paint(Graphics g) {
        // Повторно воспроизвести содержимое окна
    }
}
