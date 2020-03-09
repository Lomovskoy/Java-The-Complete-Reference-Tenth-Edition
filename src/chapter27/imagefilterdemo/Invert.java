package chapter27.imagefilterdemo;

import java.awt.*;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;

/**
 * Этот класс демонстрирует инвертирующий фильтр.
 * Он разделяет сначала каналы красного, зелёного и синего цветов,
 * а затем обращает их цвета вычисляя их из значения 255.
 * Обращённые значения отдельных каналов цвета составляются
 * обратно в значение цвета пикселя и затем возвращаются.
 *
 * @author Ломовской К.Ю.
 * @since 09.03.2020
 */
public class Invert extends RGBImageFilter implements PlugInFilter {

    public Invert(){}

    @Override
    public Image filter(Frame f, Image in) {
        return f.createImage(new FilteredImageSource(in.getSource(), this));
    }

    @Override
    public int filterRGB(int x, int y, int rgb) {
        int r = 0xff - (rgb >> 16) & 0xff;
        int g = 0xff - (rgb >> 8) & 0xff;
        int b = 0xff - rgb & 0xff;
        return (0xff000000 | r << 16 | g << 8 | b);
    }
}
