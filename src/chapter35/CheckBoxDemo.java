package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются применение флагов.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2020
 */
public class CheckBoxDemo extends Application {

    CheckBox cbWeb;
    CheckBox cbDesktop;
    CheckBox cbMobile;

    Label response;
    Label allTargets;

    String targets = "";

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Demonstrate Check Box");

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

        Label heading = new Label("Selected deployment options");

        // Создать метку состояния
        response = new Label("No deployment selected");

        // Создать метку извещающую обо всех установленныз флагах
        allTargets = new Label("Target list: <none>");

        // Создать флаги
        cbWeb = new CheckBox("Web");
        cbDesktop = new CheckBox("Desktop");
        cbMobile = new CheckBox("Mobile");

        // Обрабатывать события действия от флагов
        cbWeb.setOnAction(ae -> {
            if (cbWeb.isSelected())
                response.setText("Web deployment selected");
            else
                response.setText("Web deployment cleared");
            showAll();
        });

        cbDesktop.setOnAction(ae -> {
            if (cbWeb.isSelected())
                response.setText("Desktop deployment selected");
            else
                response.setText("Desktop deployment cleared");
            showAll();
        });

        cbMobile.setOnAction(ae -> {
            if (cbWeb.isSelected())
                response.setText("Mobile deployment selected");
            else
                response.setText("Mobile deployment cleared");
            showAll();
        });

        // Использовать разделитель, что бы улучшить порядок расположения
        // элементов управления
        Separator separator = new Separator();
        separator.setPrefHeight(200);

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(heading, separator, cbWeb, cbDesktop, cbMobile, response, allTargets);

        // Показать подмостки и сцену на них
        stage.show();
    }

    // Обновить и показать список всех флажков
    void showAll(){
        targets = "";
        if (cbWeb.isSelected())
            targets += "Web ";
        if (cbDesktop.isSelected())
            targets += "Desktop ";
        if (cbMobile.isSelected())
            targets += "Mobile ";

        if (targets.equals(""))
            targets = "<none>";

        allTargets.setText("Target list: " + targets);
    }
}
