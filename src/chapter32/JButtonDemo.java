package chapter32;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * В этой программе демонстрируются
 * примение компонента JButton в виде значка.
 *
 * @author Ломовской К.Ю.
 * @since 02.04.2020
 */
public class JButtonDemo implements ActionListener {
    JLabel jLabel;

    public JButtonDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JButtonDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(500, 450);

        // Ввести кнопки на панель содержимого
        ImageIcon hourglass = new ImageIcon("hourglass.png");
        JButton jb = new JButton(hourglass);
        jb.setActionCommand("Hourglass");
        jb.addActionListener(this);
        jFrame.add(jb);

        ImageIcon analog = new ImageIcon("analog.png");
        jb = new JButton(analog);
        jb.setActionCommand("Analog Clock");
        jb.addActionListener(this);
        jFrame.add(jb);

        ImageIcon digital = new ImageIcon("digital.png");
        jb = new JButton(digital);
        jb.setActionCommand("Digital Clock");
        jb.addActionListener(this);
        jFrame.add(jb);

        ImageIcon stopWatch = new ImageIcon("stopWatch.png");
        jb = new JButton(stopWatch);
        jb.setActionCommand("StopWatch");
        jb.addActionListener(this);
        jFrame.add(jb);

        // Создать метку и ввести её на панели содержимого
        jLabel = new JLabel("Choose a Timepiece");
        jFrame.add(jLabel);

        // Отобразить Фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    // Обработать события действия
    @Override
    public void actionPerformed(ActionEvent ae) {
        jLabel.setText("You selected " + ae.getActionCommand());
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JButtonDemo::new);
    }
}
