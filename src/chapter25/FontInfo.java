package chapter25;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий сведения о шрифте.
 *
 * @author Ломовской К.Ю.
 * @since 03.03.2020
 */
public class FontInfo extends Frame {

    public FontInfo(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Font f = g.getFont();
        String fontName = f.getName();
        String fontFamily = f.getFamily();

        int fontSize = f.getSize();
        int fontStyle = f.getStyle();

        String mgs = "Family: " + fontName;

        mgs += ", Font: " + fontFamily;
        mgs += ", Size: " + fontSize + ", Style: ";

        if ((fontStyle & Font.BOLD) == Font.BOLD)
            mgs += "Blod ";
        if ((fontStyle & Font.ITALIC) == Font.ITALIC)
            mgs += "Italic ";
        if ((fontStyle & Font.PLAIN) == Font.PLAIN)
            mgs += "Plan ";

        g.drawString(mgs, 10, 60);
    }

    public static void main(String[] args) {
        FontInfo appWin = new FontInfo();
        appWin.setSize(new Dimension(300, 100));
        appWin.setTitle("FontInfo");
        appWin.setVisible(true);
    }
}
