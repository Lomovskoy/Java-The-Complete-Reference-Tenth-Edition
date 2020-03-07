package chapter26;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется
 * применение текстовой области.
 *
 * @author Ломовской К.Ю.
 * @since 06.03.2020
 */
public class TextAreaDemo extends Frame {

    private static final String val = "Java 9 is the lasted version of the most\n" +
            "widely-used computer language for internet programming.\n" +
            "Building on a rich heritage, Java has advanced both\n" +
            "the art and science of computer language design.\n\n" +
            "One of the reasons for Java`s ongoing success is its\n" +
            "constant, steady rate of evolution. Java has never stood\n" +
            "still. Instead, Java has consistently adapter to the\n" +
            "rapidly changing landscape of the networked world.\n" +
            "Moreover, Java has often led the\n" +
            "way, charting the course for others to follow.";

    public TextAreaDemo(){

        // Использовать диспетчер поточной окмпановки
        setLayout(new FlowLayout());
        TextArea text = new TextArea(val, 10, 30);
        add(text);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        TextAreaDemo appWin = new TextAreaDemo();
        appWin.setSize(new Dimension(300, 220));
        appWin.setTitle("TextAreaDemo");
        appWin.setVisible(true);
    }
}