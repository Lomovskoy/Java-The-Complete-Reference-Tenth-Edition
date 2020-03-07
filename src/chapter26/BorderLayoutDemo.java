package chapter26;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется
 * применение граничной компановки.
 *
 * @author Ломовской К.Ю.
 * @since 07.03.2020
 */
public class BorderLayoutDemo extends Frame {

    private final static String msg = "The reasonable man adapts himself to the world;\n" +
            "the unreasonable one persists in trying to adapt the world to himself.\n" +
            "Therefore all progress depends on the unreasonable man.\n\n" +
            "        - George Bernard Shaw\n\n";

    public BorderLayoutDemo(){

        // В данном случае диспетчер граничной
        // компановки использцется по умолчанию
        add(new Button("This is across the top."), BorderLayout.NORTH);
        add(new Label("The footer message might go here."), BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);
        add(new TextArea(msg), BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        BorderLayoutDemo appWin = new BorderLayoutDemo();
        appWin.setSize(new Dimension(300, 220));
        appWin.setTitle("BorderLayoutDemo");
        appWin.setVisible(true);
    }
}
