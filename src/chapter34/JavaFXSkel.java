package chapter34;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * скелет Java-FX приложения.
 *
 * @author Ломовской К.Ю.
 * @since 01.05.2020
 */
public class JavaFXSkel extends Application {

    public static void main(String[] args) {

        System.out.println("Запуск Java-FX приложения");

        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод init
    @Override
    public void init(){
        System.out.println("В теле метода init().");
    }

    // Переопределить метод init
    @Override
    public void start(Stage myStage) {

        System.out.println("В теле метода start().");

        // Присвоить заголовок подмосткам
        myStage.setTitle("Java-FX Skeleton");

        // Создать корневой узел. В данном случае используется
        // панель поточной компоновки, хотя возможны и другие
        // варианты компоновки.
        FlowPane rootNode = new FlowPane();

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);

        // Установить сцену на подмостках
        myStage.setScene(myScene);

        // Показать подмостки и сцену на них
        myStage.show();
    }

    // Переопределить метод stop()
    @Override
    public void stop(){
        System.out.println("В теле метода stop().");
    }

}
