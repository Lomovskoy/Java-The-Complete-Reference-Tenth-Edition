package chapter32;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * В этой программе демонстрируются
 * примение компонента JRadioButton.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class JRadioButtonDemo implements ActionListener {
    JLabel jLabel;

    public JRadioButtonDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JRadioButtonDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(250, 100);

        // Создать кнопки-переключатели и ввести
        // их панели содержимого
        JRadioButton b1 = new JRadioButton("A");
        b1.addActionListener(this);
        jFrame.add(b1);

        JRadioButton b2 = new JRadioButton("B");
        b2.addActionListener(this);
        jFrame.add(b2);

        JRadioButton b3 = new JRadioButton("C");
        b3.addActionListener(this);
        jFrame.add(b3);

        // Определить группу кнопок
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(b1);
        buttonGroup.add(b2);
        buttonGroup.add(b3);

        // Создать метку и ввестиеё на панели содкержимого
        jLabel = new JLabel("Select One");
        jFrame.add(jLabel);

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    // Обработать события от кнопки переключателя
    @Override
    public void actionPerformed(ActionEvent ae) {
        jLabel.setText("You selected " + ae.getActionCommand());
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JRadioButtonDemo::new);
    }
}
