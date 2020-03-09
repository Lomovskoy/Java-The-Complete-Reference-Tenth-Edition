package chapter27.imagefilterdemo;

import java.awt.*;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;

/**
 * Этот класс демонстрирует контратный фильтр.
 * В этом классе приеняется алгоритм в котором значения
 * красной, синей и зелёной составляющих цвета умножаются
 * по отдельности на коэффициент 1.2 если уровень их яркости
 * выше 128, или делятся на 1.2 если уровень их яркости ниже 128.
 *
 * @author Ломовской К.Ю.
 * @since 09.03.2020
 */
public class Contrast extends RGBImageFilter implements PlugInFilter {

    double gain = 1.2;

    @Override
    public Image filter(Frame f, Image in) {
        return f.createImage(new FilteredImageSource(in.getSource(), this));
    }

    @Override
    public int filterRGB(int x, int y, int rgb) {
        int r = count((rgb >> 16) & 0xff);
        int g = count((rgb >> 8) & 0xff);
        int b = count(rgb & 0xff);
        return (0xff000000 | r << 16 | g << 8 | b);
    }

    private int multclamp(int in, double factor){
        in = (int) (in * factor);
        return Math.min(in, 255);
    }

    private int count(int in){
        return (in < 128) ? (int) (in / gain) : multclamp(in, gain);
    }
}
