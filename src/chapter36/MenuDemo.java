package chapter36;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * В этой программе демонстрируются
 * простое главное меню Java-FX.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2020
 */
public class MenuDemo extends Application {

    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Demonstrate Demo");

        // Используется панель граничной компоновки типа BorderPane
        BorderPane rootNode = new BorderPane();

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 300);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        // Создать метку для отображения результатов выбора меню
        response = new Label("Menu Demo");

        // Создать строку меню
        MenuBar mb = new MenuBar();

        // Создать меню File
        Menu fileMenu = new Menu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem close = new MenuItem("Close");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        fileMenu.getItems().addAll(open, close, save, exit);

        // Ввести меню File в строку меню
        mb.getMenus().add(fileMenu);

        // Создание меню Options
        Menu optionsMenu = new Menu("Options");

        // Создание подменю Colors
        Menu colorsMenu = new Menu("Colors");
        MenuItem read = new MenuItem("Read");
        MenuItem green = new MenuItem("Green");
        MenuItem blue = new MenuItem("Blue");

        colorsMenu.getItems().addAll(read, green, blue);
        optionsMenu.getItems().add(colorsMenu);

        // Создание подменю Priority
        Menu priorityMenu = new Menu("Priority");
        MenuItem high = new MenuItem("High");
        MenuItem low = new MenuItem("Low");

        priorityMenu.getItems().addAll(high, low);
        optionsMenu.getItems().add(priorityMenu);

        // Ввести разделитель
        optionsMenu.getItems().add(new SeparatorMenuItem());

        // Создать пункт Reset
        MenuItem reset = new MenuItem("Reset");
        optionsMenu.getItems().add(reset);

        // Ввести меню Options в строку меню
        mb.getMenus().add(optionsMenu);

        // Создать меню Help
        Menu helpMenu = new Menu("Help");
        MenuItem about = new MenuItem("About");
        helpMenu.getItems().add(about);

        // Ввести меню Help в строку меню
        mb.getMenus().add(helpMenu);

        // Создать один приёмник действия для обработки
        // всех событий действия, наступающих в меню
        EventHandler<ActionEvent> MEHandler = (ae) -> {
            String name = ((MenuItem)ae.getTarget()).getText();
            // Выйти из программы есди выбран пункт меню Exit
            if (name.equals("Exit"))
                Platform.exit();
            response.setText(name + " selected");
        };

        // Установить приёмники действия от пунктов меню
        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);
        read.setOnAction(MEHandler);
        green.setOnAction(MEHandler);
        blue.setOnAction(MEHandler);
        high.setOnAction(MEHandler);
        low.setOnAction(MEHandler);
        reset.setOnAction(MEHandler);
        about.setOnAction(MEHandler);

        // Ввести строку меню в верхнюю часть панели граничной
        // компоновки, а метку response - в центре этой панели
        rootNode.setTop(mb);
        rootNode.setCenter(response);

        // Показать подмостки и сцену на них
        stage.show();
    }
}
