package chapter24;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется
 * применение текстового поля.
 *
 * @author Ломовской К.Ю.
 * @since 06.03.2020
 */
public class TextFieldDemo extends Frame implements ActionListener {

    TextField name, pass;

    public TextFieldDemo(){

        // Использовать диспетчер поточной компановки
        setLayout(new FlowLayout());

        // Создать элементы управления
        Label namep = new Label("Name: ", Label.RIGHT);
        Label passp = new Label("Password: ", Label.RIGHT);
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('*');

        // Ввести элементы уравления в фрейм
        add(namep);
        add(name);
        add(passp);
        add(pass);

        // Ввести обработчики событий действия
        name.addActionListener(this);
        pass.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override // Пользователь нажал клавишу Enter
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
    }

    @Override
    public void paint(Graphics g){
        g.drawString("Name: " + name.getText(), 20, 100);
        g.drawString("Selected text in name: " + name.getSelectedText(), 20, 120);
        g.drawString("Password: " + pass.getText(), 20, 140);
    }

    public static void main(String[] args) {
        TextFieldDemo appWin = new TextFieldDemo();

        appWin.setSize(new Dimension(280, 180));
        appWin.setTitle("TextFieldDemo");
        appWin.setVisible(true);
    }
}
