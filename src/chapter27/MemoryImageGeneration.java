package chapter27;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.MemoryImageSource;

/**
 * В это программе демонстрируется
 * формирование изображение в оперативной памяти.
 *
 * @author Ломовской К.Ю.
 * @since 08.03.2020
 */
public class MemoryImageGeneration extends Frame{
    Image img;
    int w = 512;
    int h = 512;

    public MemoryImageGeneration(){
        int[] pixels = new int[w * h];
        int i = 0;

        for (int y = 0; y < h; y++){
            for (int x = 0; x < w; x++){
                int r = (x ^ y) &0xff;
                int g = (x * 2 ^ y * 2) &0xff;
                int b = (x * 4 ^ y * 4) &0xff;
                pixels[i++] = (255 << 24) | (r << 16) | (g << 8) | b;
            }
        }

        img = createImage(new MemoryImageSource(w, h, pixels,0, w));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g){
        g.drawImage(img, getInsets().left, getInsets().top, null);
    }

    public static void main(String[] args) {
        MemoryImageGeneration appWin = new MemoryImageGeneration();
        appWin.setSize(new Dimension(400, 400));
        appWin.setTitle("MemoryImageGeneration");
        appWin.setVisible(true);
    }
}
