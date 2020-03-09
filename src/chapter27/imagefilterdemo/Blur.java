package chapter27.imagefilterdemo;

/**
 * Этот класс демонстрирует фильтр Блюр.
 * Для фильтрации изображения он создает массив пикселей,
 * вычисляет среднее значение окружающего цвета вокруг
 * каждого пикселя в области 3х3. Вычиленное среднее значение
 * сохраняется в новый массив и отдается обратно
 *
 * @author Ломовской К.Ю.
 * @since 09.03.2020
 */
public class Blur extends Convolver{

    @Override
    void convolve() {
        for (int y = 1; y < height - 1; y++){
            for (int x = 1; x < width - 1; x++){
                int rs = 0;
                int gs = 0;
                int bs = 0;

                for (int k =-1; k <= 1; k++){
                    for (int j =-1; j <= 1; j++){
                        int rgb = imgPixels[(y + k) * width + x + j];
                        int r = (rgb >> 16) & 0Xff;
                        int g = (rgb >> 8) & 0Xff;
                        int b = rgb & 0Xff;
                        rs += r;
                        gs += g;
                        bs += b;
                    }
                }
                rs /= 9;
                gs /= 9;
                bs /= 9;

                newImgPixels[y * width + x] = (0xff000000 | rs << 16 | gs << 8 | bs);
            }
        }
    }
}
