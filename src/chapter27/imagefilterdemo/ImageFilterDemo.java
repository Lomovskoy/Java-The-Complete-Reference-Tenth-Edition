package chapter27.imagefilterdemo;

import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
import java.lang.reflect.*;

/**
 * В это программе демонстрируется
 * применение фильтров изображений.
 *
 * @author Ломовской К.Ю.
 * @since 09.03.2020
 */
public class ImageFilterDemo extends Frame implements ActionListener {

    Image img;
    PlugInFilter pif;
    Image fimg;
    Image curImg;
    LoadedImage lim;
    Label lab;
    Button reset;

    // Наименование фильтров
    String[] filters = {"Grayscale", "Invert", "Contrast", "Blur", "Sharpen"};

    public ImageFilterDemo(){
        Panel p = new Panel();
        add(p, BorderLayout.SOUTH);

        // Создать экранную кнопку Reset (Сброс)
        reset = new Button("Reset");
        reset.addActionListener(this);
        p.add(reset);

        // Ввести экранные кнопки выбора фильтров
        for (String fstr: filters){
            Button b = new Button(fstr);
            b.addActionListener(this);
            p.add(b);
        }

        // Создать верхнюю метку
        lab = new Label("");
        add(lab, BorderLayout.NORTH);

        // Загрузить изображение
        try {
            File imageFile = new File("Alyona_Shirshova.jpeg");

            // Загрузить изображение
            img = ImageIO.read(imageFile);
        } catch (IOException exc){
            System.out.println("Cannot load image file.");
            System.exit(0);
        }

        // Получить загруженное изображение и расположить его по центру
        lim = new LoadedImage(img);
        add(lim, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String a = "";

        try {
            a = ae.getActionCommand();
            if (a.equals("Reset")){
                lim.set(img);
                lab.setText("Normal");
            } else {
                // Получить выбранный фильтр
                pif = (PlugInFilter) (Class.forName(a)).getConstructor().newInstance();
                fimg = pif.filter(this, img);
                lim.set(fimg);
                lab.setText("Filtered: " + a);
            }
            repaint();
        } catch (ClassNotFoundException e){
            lab.setText(a + " not found");
            lim.set(img);
            repaint();
        } catch (InstantiationException e){
            lab.setText("couldn`t new " + a);
        } catch (IllegalAccessException e){
            lab.setText("no access: " + a);
        } catch (NoSuchMethodException | InvocationTargetException e){
            lab.setText("Filter creation error: " + e);
        }
    }

    public static void main(String[] args) {
        ImageFilterDemo appWin = new ImageFilterDemo();
        appWin.setSize(new Dimension(420, 420));
        appWin.setTitle("ImageFilterDemo");
        appWin.setVisible(true);
    }
}
