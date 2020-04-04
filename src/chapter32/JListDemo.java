package chapter32;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонента JList.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class JListDemo {

    // Создать массив из названий городов
    String[] cities = {
            "Москва", "Санкт-Петербург", "Новосибирск",
            "Оренбург", "Самара", "Екатеринбурк",
            "Челябинск", "Магнитогорск", "Волгоград",
            "Чебоксары", "Казань", "Электросталь"
    };

    public JListDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JListDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(200, 200);

        // Создать список на основе компонента типа JList
        JList<String> jList = new JList<>(cities);

        // Задать режим выбораединственного элемента из списка
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Ввести список на панели с полосами прокрутки
        JScrollPane jscrollP = new JScrollPane(jList);

        // Задать предпочтительные размеры панели
        // с полосами прокрутки
        jscrollP.setPreferredSize(new Dimension(120, 90));

        // Создать метку для отображения выбранного города
        JLabel jLabel = new JLabel("Выберите свой город");

        // Ввести приемник событий выбора элементов из списка
        jList.addListSelectionListener(le -> {
            // Получить индекс изменённого
            int idx = jList.getSelectedIndex();

            // отобразить сделанный выбор, если элемент
            // был выбран из списка
            if (idx != -1)
                jLabel.setText("Текущий выбор: " + cities[idx]);
            else
                // В противном случае ещё раз предлоджить
                // выбрать город из списка
                jLabel.setText("Выберите свой город.");
        });

        // Ввести список и метку на панели содержимого
        jFrame.add(jscrollP);
        jFrame.add(jLabel);

        // отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JListDemo::new);
    }
}
