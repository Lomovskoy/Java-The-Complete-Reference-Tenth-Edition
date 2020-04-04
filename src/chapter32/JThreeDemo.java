package chapter32;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонента JThree.
 *
 * @author Ломовской К.Ю.
 * @since 04.04.2020
 */
public class JThreeDemo {

    public JThreeDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JThreeDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(200, 250);

        // Создать самый вкрхний узел дерева
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");

        // Создать поддерево "A"
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

        // Создать поддерево "B"
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);

        // Создать дерево
        JTree tree = new JTree(top);

        // Ввести дерево на панели прокрутки
        JScrollPane jsp = new JScrollPane(tree);

        // Ввести панель с половами прокрутки на панели содержимого
        jFrame.add(jsp);

        // Ввести меку на панели содержимого
        JLabel jLabel = new JLabel();
        jFrame.add(jLabel, BorderLayout.SOUTH);

        // Обработать события выбора узлов дерева
        tree.addTreeSelectionListener(e ->
            jLabel.setText("Выбран " + e.getPath())
        );

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JThreeDemo::new);
    }
}
