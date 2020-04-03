package chapter32;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * В этой программе демонстрируются
 * примение компонента JCheckBox.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class JCheckBoxDemo implements ItemListener {
    JLabel jLabel;

    public JCheckBoxDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JButtonDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(250, 100);

        // Ввести флаги на панели содержимого
        JCheckBox checkBox = new JCheckBox("C");
        checkBox.addItemListener(this);
        jFrame.add(checkBox);

        checkBox = new JCheckBox("C++");
        checkBox.addItemListener(this);
        jFrame.add(checkBox);

        checkBox = new JCheckBox("Java");
        checkBox.addItemListener(this);
        jFrame.add(checkBox);

        checkBox = new JCheckBox("Perl");
        checkBox.addItemListener(this);
        jFrame.add(checkBox);

        // Создать метку и ввести ей на панель содержимого
        jLabel = new JLabel("Select language");
        jFrame.add(jLabel);

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    // Обработать события от выбираемых элементов,
    // наступающие при установке и сбросе флажков
    @Override
    public void itemStateChanged(ItemEvent ie) {
        JCheckBox checkBox = (JCheckBox) ie.getItem();

        if (checkBox.isSelected())
            jLabel.setText(checkBox.getText() + " is selected");
        else
            jLabel.setText(checkBox.getText() + " is cleared");
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JCheckBoxDemo::new);
    }
}
