package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются эффекты:
 * вращение, масштабирвоание, свечение и внутренняя тень.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2020
 */
public class EffectsAndTransformsDemo extends Application {

    double angle = 0.0;
    double gowVal = 0.0;
    boolean shadow = Boolean.FALSE;
    double scaleFactor = 1.0;

    // Сформировать начальные эффекты и преобразования
    Glow glow = new Glow(0.0);
    InnerShadow innerShadow = new InnerShadow(10.0, Color.RED);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);

    // Создать четые экранные кнопки
    Button btnRotate = new Button("Rotate");
    Button btnGlow = new Button("Glow");
    Button btnShadow = new Button("Shadow off");
    Button btnScale = new Button("Scale");

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Effects And Transforms Demo");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 100);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        // Задасть первоначальный эфект свечения
        btnGlow.setEffect(glow);

        // Ввести вращение в список преобразование
        // для экранной кнопки Rotate
        btnRotate.getTransforms().add(rotate);

        // Ввести масштабирование в список преобразование
        // для экранной кнопки Scale
        btnScale.getTransforms().add(scale);

        // Обработать событияот кнопки Rotate
        btnRotate.setOnAction(ae -> {
            // Всякий раз, когда кнопка нажимается,
            // она поворачивается на 30 градусов
            // вокруг своего центра
            angle += 30.0;

            rotate.setAngle(angle);
            rotate.setPivotX(btnRotate.getWidth() / 2);
            rotate.setPivotY(btnRotate.getHeight() / 2);
        });

        // Обработать событияот кнопки Scale
        btnScale.setOnAction(ae -> {
            // Всякий раз, когда кнопка нажимается,
            // изменяетсчя её масштаб
            scaleFactor += 0.1;
            if (scaleFactor > 1.0)
                scaleFactor = 0.4;

            scale.setX(scaleFactor);
            scale.setY(scaleFactor);
        });

        // Обработать событияот кнопки Glow
        btnGlow.setOnAction(ae -> {
            // Всякий раз, когда кнопка нажимается,
            // изменяется степень её свечения
            gowVal += 0.1;

            if (gowVal > 1.0)
                gowVal = 0.0;

            // Установить новое значение свечения
            glow.setLevel(gowVal);
        });

        // Обработать событияот кнопки Shadow
        btnShadow.setOnAction(ae -> {
            // Всякий раз, когда кнопка нажимается,
            // изменяется состояние её затенения
            shadow = !shadow;

            if (shadow){
                btnShadow.setEffect(innerShadow);
                btnShadow.setText("Shadow On");
            } else {
                btnShadow.setEffect(null);
                btnShadow.setText("Shadow Of");
            }
        });

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(btnRotate, btnScale, btnGlow, btnShadow);

        // Показать подмостки и сцену на них
        stage.show();

    }
}
