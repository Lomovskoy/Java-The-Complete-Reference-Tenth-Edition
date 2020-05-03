package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются применение панели прокрутки.
 * В данном Java-FX приложении прокручивается содержимое
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2020
 */
public class ScrollPaneDemo extends Application {

    ScrollPane scrollPane;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Scroll Panel Demo");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 230, 140);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        // Создать многострочную прокручиваемую метку,
        // где отмечаются преимущества элементов управления
        // типа ScrollPane над отдельными элементами
        // управления полосами прокрутки
        Label scrollLabel = new Label(
                "A ScrollPane streamlines the process of\n" +
                        "adding scroll bars to a window whose\n" +
                        "contents exceed the window`s dimensions.\n" +
                        "It also enables a control to fit in a\n" +
                        "smaller space than it otherwise would.\n" +
                        "As such it often provides a superior\n" +
                        "approach over using individual scroll bars."
        );

        // Создать панель прокрутки, установив в качестве
        // содержимого метку scrollLabel
        scrollPane = new ScrollPane(scrollLabel);

        // Задать ширину и высоту окна просмотра
        scrollPane.setPrefViewportWidth(130);
        scrollPane.setMinViewportHeight(80);

        // Разрешить панаромирование прокручиваемого содержимого
        scrollPane.setPannable(Boolean.TRUE);

        // Создать кнопку сброса
        Button buttonReset = new Button("Reset scroll bar Positions");

        //Обработать событие от нажатия кнопки сброса
        buttonReset.setOnAction(ae -> {
            scrollPane.setVvalue(0);
            scrollPane.setHvalue(0);
        });

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(scrollPane, buttonReset);

        // Показать подмостки и сцену на них
        stage.show();
    }
}
