package chapter34;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class JavaFXEventDemo extends Application {

    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage myStage) {

        // Присвоить заголовок подмосткам
        myStage.setTitle("Java-FX Button and Event");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);

        // Установить сцену на подмостках
        myStage.setScene(myScene);

        // Создать метку
        response = new Label("Push a Button");

        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");

        // Обработать события действия от кнопки Alpha
        btnAlpha.setOnAction(ae -> response.setText("Alpha was pressed."));

        // Обработать события действия от кнопки Beta
        btnBeta.setOnAction(ae -> response.setText("Beta was pressed."));

        // Ввести метку в граф сцены
        rootNode.getChildren().addAll(btnAlpha, btnBeta, response);

        // Показать подмостки и сцену на них
        myStage.show();
    }
}
