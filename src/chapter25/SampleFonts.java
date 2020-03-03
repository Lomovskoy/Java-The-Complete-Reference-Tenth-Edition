package chapter25;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий изменение
 * некоторых шрифтов.
 *
 * @author Ломовской К.Ю.
 * @since 03.03.2020
 */
public class SampleFonts extends Frame {
    int next = 0;
    Font f;
    String msg;

    public SampleFonts() {
        f = new Font("Dialog", Font.PLAIN, 12);
        msg = "Dialog";
        setFont(f);

        addMouseListener(new MyMouseAdapter(this));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 10, 60);
    }

    public static void main(String[] args) {
        SampleFonts appWin = new SampleFonts();

        appWin.setSize(new Dimension(200, 100));
        appWin.setTitle("SampleFonts");
        appWin.setVisible(true);
    }

    public class MyMouseAdapter extends MouseAdapter{
        SampleFonts sampleFonts;

        public MyMouseAdapter(SampleFonts sampleFonts){
            this.sampleFonts = sampleFonts;
        }

        @Override
        public void mousePressed(MouseEvent me) {

            // Сменить после каждого щелчка кнопкой мыши
            sampleFonts.next++;
            switch (sampleFonts.next){
                case 0:
                    sampleFonts.f = new Font("Dialog", Font.PLAIN, 12);
                    sampleFonts.msg = "Dialog";
                    break;
                case 1:
                    sampleFonts.f = new Font("DialogInput", Font.PLAIN, 12);
                    sampleFonts.msg = "DialogInput";
                    break;
                case 2:
                    sampleFonts.f = new Font("SansSerif", Font.PLAIN, 12);
                    sampleFonts.msg = "SansSerif";
                    break;
                case 3:
                    sampleFonts.f = new Font("Serif", Font.PLAIN, 12);
                    sampleFonts.msg = "Serif";
                    break;
                case 4:
                    sampleFonts.f = new Font("Monospaced", Font.PLAIN, 12);
                    sampleFonts.msg = "Monospaced";
                    break;
            }

            if (sampleFonts.next == 4) sampleFonts.next = -1;
            sampleFonts.setFont(sampleFonts.f);
            sampleFonts.repaint();
        }
    }

}