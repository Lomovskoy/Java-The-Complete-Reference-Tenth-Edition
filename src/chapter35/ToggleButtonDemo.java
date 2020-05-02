package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * применение переключателя.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2020
 */
public class ToggleButtonDemo extends Application {

    Label response;
    ToggleButton button;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Demonstrate a Toggle Button");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 220, 120);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        // Создать метку
        response = new Label("Push a button.");

        // Создать переключатель
        button = new ToggleButton("On/Of");

        // обработать события действия от переключателя
        button.setOnAction(ae -> {
            if (button.isSelected())
                response.setText("Button is on");
            else
                response.setText("Button is of");
        });

        // Ввести в граф сцены
        rootNode.getChildren().addAll(button, response);

        // Показать подмостки и сцену на них
        stage.show();

    }
}
