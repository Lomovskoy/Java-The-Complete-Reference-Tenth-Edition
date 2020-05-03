package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * применение текстового поля.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2020
 */
public class TestFieldDemo extends Application {

    TextField tf;
    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Test Field Demo");

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

        // Создать метку
        response = new Label("Search string: ");

        // Создать кнопку
        Button butGetText = new Button("Get Search String");

        // Созать текстовое поле
        tf = new TextField();

        // Создать подсказку
        tf.setPromptText("Enter Search String");

        // Задать предпочтительное количество столбцов
        tf.setPrefColumnCount(15);

        // Обработать события действия от текстового поля.
        // События действия генерируются от нажатя клавиши
        // <Enter>, когда фокус ввода находится в ткстовом
        // поле. В таком случае получается и отображается
        // текст, введённый в текстовом поле.
        tf.setOnAction(ae -> response.setText("Search string: " + tf.getText()));

        // Получить текст из текстового поля, если зажата
        // клавиша <Enter> а затем отобразить его.
        butGetText.setOnAction(ae -> response.setText("Search string: " + tf.getText()));

        // Использовать разделитель, что бы улучшить порядок расположения
        // элементов управления
        Separator separator = new Separator();
        separator.setPrefHeight(180);

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(tf, butGetText, separator, response);

        // Показать подмостки и сцену на них
        stage.show();
    }
}
