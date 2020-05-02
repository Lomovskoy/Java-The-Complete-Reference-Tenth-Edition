package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются применение кнопок переключателя.
 * Это Java-FX приложение реагирает на событие действия, генерируемые
 * выбираемыми кнопками-переключатлями. В нём демонстрируется так же
 * активизация кнопки переключателя под управлением программы.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2020
 */
public class RadioButtonDemo extends Application {


    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Demonstrate Radio ButtonDemo");

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
        response = new Label("");

        // Создать кнопки переключатли
        RadioButton rbtTrain = new RadioButton("Train");
        RadioButton rbtCar = new RadioButton("Car");
        RadioButton rbtAirplane = new RadioButton("Airplane");

        // Создать группу кнопок переключателей
        ToggleGroup toggleGroup = new ToggleGroup();

        // ввести кнопки в группу
        rbtTrain.setToggleGroup(toggleGroup);
        rbtCar.setToggleGroup(toggleGroup);
        rbtAirplane.setToggleGroup(toggleGroup);

        // Обработать события действия от кнопок переключателей
        rbtTrain.setOnAction(ae -> response.setText("Transport selected is train"));
        rbtCar.setOnAction(ae -> response.setText("Transport selected is car."));
        rbtAirplane.setOnAction(ae -> response.setText("Transport selected is airplane"));

        // Инициировать события от первой выбранной кнопки переключателя.
        // В итоге кнопка переключателяь выбирается и наступает событие
        // действия от этой кнопки перключателя.
        rbtTrain.fire();

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(rbtTrain, rbtCar, rbtAirplane, response);

        // Показать подмостки и сцену на них
        stage.show();
    }
}
