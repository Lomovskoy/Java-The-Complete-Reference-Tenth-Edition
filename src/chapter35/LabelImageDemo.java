package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * изображение на месте метки.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2020
 */
public class LabelImageDemo extends Application {

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Display in image label");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла
        FlowPane rootNode = new FlowPane();

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        // Создать объект изображения
        ImageView image = new ImageView("hourglass.jpg");

        // Создать метку для изображения
        Label label = new Label("Hourglass", image);

        // Ввести изображения в граф сцены
        rootNode.getChildren().add(label);

        // Показать подмостки и сцену на них
        stage.show();

    }
}
