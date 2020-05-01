package chapter34;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются применение
 * элемента управления меткой JavaFx.
 *
 * @author Ломовской К.Ю.
 * @since 01.05.2020
 */
public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage myStage) {

        // Присвоить заголовок подмосткам
        myStage.setTitle("Java-FX Label");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла
        FlowPane rootNode = new FlowPane();

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);

        // Установить сцену на подмостках
        myStage.setScene(myScene);

        // Создать метку
        Label myLabel = new Label("This is a Java-FX Label");

        // Ввести метку в граф сцены
        rootNode.getChildren().add(myLabel);

        // Показать подмостки и сцену на них
        myStage.show();
    }
}
