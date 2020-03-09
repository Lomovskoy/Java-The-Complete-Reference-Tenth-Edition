package chapter27.imagefilterdemo;

import java.awt.*;

/**
 * Это служебный класс обесечивающий переоределение
 * методов getPreferredSize() и getMinimumSize() позволяет задать
 * новое изображение типа Image которое требуется воспроизовести на
 * типа Canvas, поведене измененно таким образом, что отфильтрованное
 * изображение воспроизводится по завершении его обработки.
 *
 * @author Ломовской К.Ю.
 * @since 09.03.2020
 */
public class LoadedImage extends Canvas {
    Image img;

    public LoadedImage(Image i){
        set(i);
    }

    void set(Image i){
        img = i;
        repaint();
    }

    @Override
    public void paint(Graphics g){
        if (img == null){
            g.drawString("No image", 10, 30);
        } else {
            g.drawImage(img, 0, 0, this);
        }
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(img.getWidth(this), img.getHeight(this));
    }

    @Override
    public Dimension getMinimumSize(){
        return getPreferredSize();
    }
}
