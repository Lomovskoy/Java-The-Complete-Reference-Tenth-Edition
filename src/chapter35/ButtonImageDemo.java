package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * изображение на месте кнопки.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2020
 */
public class ButtonImageDemo extends Application {

    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Display in image button");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 250, 400);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        // Создать метку
        response = new Label("Push a button.");

        // Создать две экранные кнопки с текстовыми надписями
        // и изобраджением часов
        Button buttonHourglass = new Button("Hourglass", new ImageView("hourglass.jpg"));
        Button buttonAnalogClock = new Button("Analog Clock", new ImageView("analogClock.jpg"));

        // Расположить текст под изображениями
        buttonHourglass.setContentDisplay(ContentDisplay.TOP);
        buttonAnalogClock.setContentDisplay(ContentDisplay.TOP);

        // обработать события нажатия экранных кнопок
        buttonHourglass.setOnAction(ae -> response.setText("Hourglass Press"));
        buttonAnalogClock.setOnAction(ae -> response.setText("Analog Clock Press"));

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(buttonHourglass, buttonAnalogClock, response);

        // Показать подмостки и сцену на них
        stage.show();

    }
}
