package chapter34;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * рисование на холсте.
 *
 * @author Ломовской К.Ю.
 * @since 01.05.2020
 */
public class DirectDrawDemo extends Application {

    GraphicsContext gc;
    Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK};

    int colorIdx = 0;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage myStage) {

        // Присвоить заголовок подмосткам
        myStage.setTitle("Draw Directly to a Canvas");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла
        FlowPane rootNode = new FlowPane();

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 450, 450);

        // Установить сцену на подмостках
        myStage.setScene(myScene);

        // Создать холст
        Canvas myCanvas = new Canvas(400, 400);

        // Получить графический контекст для холста
        gc = myCanvas.getGraphicsContext2D();

        // Создать экранную кнопку
        Button btnChangeColor = new Button("Change Color");

        // Обработать события действия от кнопки ChangeColor
        btnChangeColor.setOnAction(ae -> {

            // Задать цвет обводки и заливки
            gc.setStroke(colors[colorIdx]);
            gc.setFill(colors[colorIdx]);

            // Перерисовать линию, текст и заполненный
            // прямоугольник новым цветом. При этом цвет
            // остальных узлов графа сцены остаётся
            // без изменений.
            gc.strokeLine(0, 0, 200, 200);
            gc.fillText("This is drawn on the canvas.", 60, 50);
            gc.fillRect(100, 320, 300, 40);

            // Изменить цвет
            colorIdx++;

            if (colorIdx == colors.length)
                colorIdx = 0;
        });

        // Нарисовать на холсте графические объекты
        // первоначально вводимые на экран
        gc.strokeLine(0, 0, 200, 200);
        gc.strokeOval(100, 100, 200, 200);
        gc.strokeRect(0, 200, 50, 200);
        gc.fillOval(0, 0, 20, 20);
        gc.fillRect(100, 320, 300, 40);

        // Задать грифт размером 20 и воспроизвести текст
        gc.setFont(new Font(20));
        gc.fillText("This is drawn on the canvas.", 60, 50);

        // Ввесдите холст и кнопку в граф сцены
        rootNode.getChildren().addAll(myCanvas, btnChangeColor);
        
        // Показать подмостки и сцену на них
        myStage.show();
    }
}
