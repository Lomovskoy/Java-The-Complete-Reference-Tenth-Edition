package chapter26;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется
 * применение карточной компановки.
 *
 * @author Ломовской К.Ю.
 * @since 07.03.2020
 */
public class CardLayoutDemo extends Frame {

    Checkbox windows10, windows8, windows7, android, solaris, mac;
    Panel osCards;
    CardLayout cardLO;
    Button win, other;

    public CardLayoutDemo(){

        // Использовать диспетчек потоковой компановки для
        // размещения компонентов в главном фрейме
        setLayout(new FlowLayout());

        win = new Button("Windows");
        other = new Button("Other");
        add(win);
        add(other);

        // Установить панель osCards для применения
        // карточной компановки
        cardLO = new CardLayout();
        osCards = new Panel();
        osCards.setLayout(cardLO);

        windows7 = new Checkbox("Windows 7", true);
        windows8 = new Checkbox("Windows 8");
        windows10 = new Checkbox("Windows 10");
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        // Ввести на панели флажки для выбора
        // разных версий ОС Windows
        Panel winPan = new Panel();
        winPan.add(windows7);
        winPan.add(windows8);
        winPan.add(windows10);

        // Ввести на панель вляжки для выбора дргих ОС
        Panel otherPan = new Panel();
        otherPan.add(android);
        otherPan.add(solaris);
        otherPan.add(mac);

        // Ввести панели отдельных карт на панели колоды карт
        osCards.add(winPan, "Windows");
        osCards.add(otherPan, "Other");

        // Ввести карты на панели главного фрейма
        add(osCards);

        // Воспользоваться лямбда-выражениями для
        // обработки событий на экранных кнопках
        win.addActionListener((ae) -> cardLO.show(osCards, "Windows"));
        other.addActionListener((ae) -> cardLO.show(osCards, "Other"));

        // Зарегистрировать приемники событий действия
        addMouseListener(new MouseAdapter() {
            @Override // Перебрать панели карт
            public void mousePressed(MouseEvent e) {
                cardLO.next(osCards);
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        CardLayoutDemo appWin = new CardLayoutDemo();
        appWin.setSize(new Dimension(300, 220));
        appWin.setTitle("CardLayoutDemo");
        appWin.setVisible(true);
    }
}
