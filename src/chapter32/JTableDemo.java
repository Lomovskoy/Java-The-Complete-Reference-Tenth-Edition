package chapter32;

import javax.swing.*;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонента JTable.
 *
 * @author Ломовской К.Ю.
 * @since 04.04.2020
 */
public class JTableDemo {

    // Инициализировать заголовки столбцов
    String[] colHeads = {"Имя", "Расширение", "Идентификатор"};

    // Инициализировать данные
    Object[][] data = {
            {"Кирилл", "1936", "356"},
            {"Алёна", "7694", "652"},
            {"Сергей", "4965", "657"},
            {"Николай", "2018", "345"},
            {"Даниил", "5038", "876"},
            {"Маша", "3827", "123"},
            {"Коля", "7848", "645"},
            {"Алёша", "6923", "158"},
            {"Александр", "5123", "256"},
            {"Валера", "7548", "431"},
            {"Аня", "5423", "678"},
            {"Татьяна", "8901", "214"},
            {"Витя", "8921", "543"}
    };

    public JTableDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JTableDemo");
        jFrame.setLayout(new BorderLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(300, 300);

        // Создать таблицу
        JTable table = new JTable(data, colHeads);

        // Ввести таблицу на панели с полосами прокрутки
        JScrollPane jsp = new JScrollPane(table);

        // Ввести панель с полосами прокрутки
        // на панели содержимого
        jFrame.add(jsp);

        // отобразить фреймы
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JTableDemo::new);
    }
}
