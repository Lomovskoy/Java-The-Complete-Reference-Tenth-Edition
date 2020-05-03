package chapter35;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * применение придставления списка.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2020
 */
public class ListViewDemo extends Application {

    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // Присвоить заголовок подмосткам
        stage.setTitle("List View Demo");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 200, 120);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        response = new Label("Selected a transport type.");

        // Создать список типа ObservableList из
        // элементов для представления списка
        ObservableList<String> transportType = FXCollections.observableArrayList("Train", "Car", "Airplane");

        // Создать представление списка
        ListView<String> lvTransport = new ListView<>(transportType);

        // Создать предпочтительную ширину и высоту
        // представления списка
        lvTransport.setPrefSize(80, 80);

        // Получить модель выбора для представления списка
        MultipleSelectionModel<String> lvSelModel = lvTransport.getSelectionModel();

        // Ввести приёмник событий измерения, чтобы реагировать
        // на выборэлементов в представлении списка
        lvSelModel.selectedItemProperty().addListener((changed, oldVal, newVal) ->
            response.setText("Transport selected is " + newVal)
        );

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(lvTransport, response);

        // Показать подмостки и сцену на них
        stage.show();

    }
}
