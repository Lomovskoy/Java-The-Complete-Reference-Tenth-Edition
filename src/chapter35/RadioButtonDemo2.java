package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются получение кнопки переключателя,
 * выбранной в текущей моент из группы, под управлением программы,
 * когда в этом возникает потребность, вместо реагирования на
 * событие или изменения.
 *
 * В данном примере события, связанные в кнопками переключателями,
 * не обрабатываются. Вместо этого просто получается выбранная в
 * данный момент кнопка переключатель, когда нажимается экранная
 * кнопка Confirm Transport Selection.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2020
 */
public class RadioButtonDemo2 extends Application {

    ToggleGroup toggleGroup;
    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Demonstrate Radio Button 2");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 200, 140);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        Label choose = new Label("        Selected a transport type.        ");

        // Создать метку
        response = new Label("No transport confirmed");

        // Создать экранную кнопку для подтверждения
        Button btnConfirm = new Button("Confirm transport selected");

        // Создать кнопки переключатли
        RadioButton rbtTrain = new RadioButton("Train");
        RadioButton rbtCar = new RadioButton("Car");
        RadioButton rbtAirplane = new RadioButton("Airplane");

        // Создать группу кнопок переключателей
        toggleGroup = new ToggleGroup();

        // ввести кнопки в группу
        rbtTrain.setToggleGroup(toggleGroup);
        rbtCar.setToggleGroup(toggleGroup);
        rbtAirplane.setToggleGroup(toggleGroup);

        // Инициировать события от первой выбранной кнопки переключателя.
        // В итоге кнопка переключателяь выбирается и наступает событие
        // действия от этой кнопки перключателя.
        rbtTrain.setSelected(Boolean.TRUE);

        // Обработать событие от кнопки подтверждения выбора транспортного средства
        btnConfirm.setOnAction(ae-> {
            // Получить выбранную в данный момент кнопку переключатель
            RadioButton radioButton = (RadioButton) toggleGroup.getSelectedToggle();

            // Отобразить результат выбора транспортного средства
            response.setText(radioButton.getText() + " is selected");
        });

        // Использовать разделитель, что бы улучшить порядок расположения
        // элементов управления
        Separator separator = new Separator();
        separator.setPrefHeight(180);

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(choose, rbtTrain, rbtCar, rbtAirplane, separator, btnConfirm, response);

        // Показать подмостки и сцену на них
        stage.show();
    }
}
