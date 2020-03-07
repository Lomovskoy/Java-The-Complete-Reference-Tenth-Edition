package chapter27;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

/**
 * В это программе демонстрируется
 * загрузку и отображения изображений.
 *
 * @author Ломовской К.Ю.
 * @since 07.03.2020
 */
public class SimpleImageLoad extends Frame {

    Image img;

    public SimpleImageLoad(){

        try {
            File imageFile = new File("Alyona_Shirshova.jpeg");

            // Загрузить изображения
            img = ImageIO.read(imageFile);
        } catch (IOException e){
            System.out.println("Cannot load image file.");
            System.exit(0);
        }

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
        SimpleImageLoad appWin = new SimpleImageLoad();
        appWin.setSize(new Dimension(400, 365));
        appWin.setTitle("SimpleImageLoad");
        appWin.setVisible(true);
    }
}
