package chapter35;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * применение комбинированного списка.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2020
 */
public class ComboBoxDemo extends Application {

    ComboBox<String> cbTransport;
    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Combo Box Demo");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 280, 120);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        response = new Label();

        // Создать список типа ObservableList из
        // элементов для представления списка
        ObservableList<String> transportType = FXCollections.observableArrayList("Train", "Car", "Airplane");

        // Создать комбинированный список
        cbTransport = new ComboBox<>(transportType);

        // Установить значение по умолчанию
        cbTransport.setValue("Train");

        // Установить метку ответной реакции на выбор по умолчанию
        response.setText("Transport selected is " + cbTransport.getValue());

        // Принимать события действия от комбинированного списка
        cbTransport.setOnAction(ae-> response.setText("Transport selected is " + cbTransport.getValue()));

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(cbTransport, response);

        // Показать подмостки и сцену на них
        stage.show();
    }
}
