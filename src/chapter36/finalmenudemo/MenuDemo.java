package chapter36.finalmenudemo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * окончатедльный вариант меню Java-FX.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2020
 */
public class MenuDemo extends Application {

    MenuBar mb;
    EventHandler<ActionEvent> MEHandler;
    ContextMenu editMenu;
    ToolBar tbDebug;
    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage myStage) {

        // Присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate Demo - final version");

        // Используется панель граничной компоновки типа BorderPane
        BorderPane rootNode = new BorderPane();

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 300);

        // Установить сцену на подмостках
        myStage.setScene(myScene);

        // Создать метку для отображения результатов выбора меню
        response = new Label("");

        // Создать один приёмник действия для обработки
        // всех событий действия, наступающих в меню
        MEHandler = (ae) -> {
            String name = ((MenuItem) ae.getTarget()).getText();
            // Выйти из программы есди выбран пункт меню Exit
            if (name.equals("Exit"))
                Platform.exit();
            response.setText(name + " selected");
        };

        // Создать строку меню
        mb = new MenuBar();

        // Создать меню File
        makeFileMenu();

        // Создать меню Options
        makeOptionsMenu();

        // Создать меню Help
        makeHelpMenu();

        // Создать меню Context
        makeContextMenu();

        // создать текстовое поле, задав ширину
        // его столбца равной 20
        TextField tf = new TextField();
        tf.setPrefColumnCount(20);

        // Ввести контекстное меню в текстовое поле
        tf.setContextMenu(editMenu);

        // Создать панель инструментов
        makeToolBar();

        // Ввести контекстное меню непосредственно в граф сцены
        rootNode.setOnContextMenuRequested(ae -> {
            // Отобразить всплвающее контекстное меню на том месте,
            // где был произведён щелчёк правой кнопкой мыши
            editMenu.show(rootNode, ae.getScreenX(), ae.getScreenY());
        });

        // Ввести строку меню в верхней области панели
        rootNode.setTop(mb);

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane fpRoot = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        fpRoot.setAlignment(Pos.CENTER);

        // Использовать разделитель, что бы улучшить
        // порядок расположения элементов управления
        Separator separator = new Separator();
        separator.setPrefHeight(260);

        // Ввести метку, рахделитель и текстовое поле
        // на панель поточной компановки
        fpRoot.getChildren().addAll(response, separator, tf);

        // Ввести панель инструментов в нижней области
        // панелиграничной компановки
        rootNode.setBottom(tbDebug);

        // Ввести панель поточной компановки в центральной
        // области панель граничной компановки
        rootNode.setCenter(fpRoot);

        // Показать подмостки и сцену на них
        myStage.show();
    }

    // Создать меню File с мнемоникой
    void makeFileMenu() {

        // Создать меню File
        Menu fileMenu = new Menu("_File");

        // Создать отдельный пункты меню File
        MenuItem open = new MenuItem("Open");
        MenuItem close = new MenuItem("Close");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        // Ввести все пункты в меню файл
        fileMenu.getItems().addAll(open, close, save, exit);

        // Ввести оперативные клавиши для быстрого выбора
        // пунктов из меню open, close, save
        open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
        close.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
        save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
        exit.setAccelerator(KeyCombination.keyCombination("shortcut+E"));

        // Установить обработчик для событий действия
        // для пунктов меню File
        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);

        // Ввести меню File в строку главного меню
        mb.getMenus().add(fileMenu);
    }

    // Создать меню Options
    void makeOptionsMenu() {

        // Создание меню Options
        Menu optionsMenu = new Menu("Options");

        // Создание подменю Colors
        Menu colorsMenu = new Menu("Colors");

        // Использовать отмчаемые флажками пункты меню, чтобы
        // пользователь мог выбратьсразу несколько цветов
        CheckMenuItem read = new CheckMenuItem("Read");
        CheckMenuItem green = new CheckMenuItem("Green");
        CheckMenuItem blue = new CheckMenuItem("Blue");

        // Ввестиотмечаемые флажком пункты в подменю Colors,
        // а само подменю Colors в менб Options
        colorsMenu.getItems().addAll(read, green, blue);
        optionsMenu.getItems().add(colorsMenu);

        // Задать зелёный уыет в качестве исходного выбираемого
        green.setSelected(Boolean.TRUE);

        // Создание подменю Priority
        Menu priorityMenu = new Menu("Priority");

        // Использовать отмечаемые кнопками-переключателями
        // пункты меню для установки приоритета. Благодаря
        // этом в меню не только отображается установленный
        // приоритет, но и гарантируется установка одного и
        // тольк одного приоритета.
        RadioMenuItem high = new RadioMenuItem("High");
        RadioMenuItem low = new RadioMenuItem("Low");

        // Создать групу кнопок-переключатеолей
        // в пунктах подменю Priority
        ToggleGroup tg = new ToggleGroup();
        high.setToggleGroup(tg);
        low.setToggleGroup(tg);

        // Отметить пункт меню high как исходно выбираемый
        high.setSelected(Boolean.TRUE);

        // Ввести отмечаемые кнопками-переключателями пункты
        // в подменю Priority, а последнее в меню Options
        priorityMenu.getItems().addAll(high, low);
        optionsMenu.getItems().add(priorityMenu);

        // Ввести разделитель
        optionsMenu.getItems().add(new SeparatorMenuItem());

        // Создать пункт Reset и ввести его в мсеню Options
        MenuItem reset = new MenuItem("Reset");
        optionsMenu.getItems().add(reset);

        // Установить приёмники действия от пунктов меню
        read.setOnAction(MEHandler);
        green.setOnAction(MEHandler);
        blue.setOnAction(MEHandler);
        high.setOnAction(MEHandler);
        low.setOnAction(MEHandler);
        reset.setOnAction(MEHandler);

        // Успользовать приемник событий изменения,
        // чтобы оперативно реагировать на изменения
        // в отметке пунктов подменю Priority
        // кнопками-переключателями
        tg.selectedToggleProperty().addListener((changed, oldWal, newVal) -> {
            if (newVal == null) return;

            // Привести значение newVal к типу RadioMenuItem
            RadioMenuItem rmi = (RadioMenuItem) newVal;

            // Отобразить результат выбора приоритета
            response.setText("Priority selected is " + rmi.getText());
        });

        // Ввести меню Options в строку главного меню
        mb.getMenus().add(optionsMenu);
    }

    // Создать меню Help
    void makeHelpMenu() {

        // Создать представление типа ImageView для изображения
        ImageView aboutIV = new ImageView("about.jpg");

        // Создать меню Help
        Menu helpMenu = new Menu("Help");

        // Создать подменю About и ввести его в меню Help
        MenuItem about = new MenuItem("About", aboutIV);
        helpMenu.getItems().add(about);

        // Установить обработчики событий действия для
        // пункта About меню Help
        about.setOnAction(MEHandler);

        // Ввести меню Help в строку главного меню
        mb.getMenus().add(helpMenu);
    }

    // Создать меню Context
    void makeContextMenu() {

        // Создать пункты для выбора команд
        // редактирования из контекстного меню
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        // Создать контекстное (т.е. всплывающее) меню
        // с пунктами выбора команд редактирования
        editMenu = new ContextMenu(cut, copy, paste);

        // Установить обработчики событий действия
        // для пунктов контекстного меню
        cut.setOnAction(MEHandler);
        copy.setOnAction(MEHandler);
        paste.setOnAction(MEHandler);

    }

    // Создать меню makeToolBar
   void makeToolBar() {

        // Создать кнопки для панели инструментов
       Button btnSet = new Button("Set Breakpoint", new ImageView("set.jpg"));
       Button btnClear = new Button("Clear Breakpoint", new ImageView("clear.jpg"));
       Button btnResume = new Button("Resume Execution", new ImageView("resume.jpg"));

       // Отключить текстовые надписи на кнопках
       btnSet.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
       btnClear.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
       btnResume.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);

       // Задать всплывающие подсказки для кнопок
       btnSet.setTooltip(new Tooltip("Set Breakpoint"));
       btnClear.setTooltip(new Tooltip("Clear Breakpoint"));
       btnResume.setTooltip(new Tooltip("Resume Execution"));

       // Создать панель инструментов
       tbDebug = new ToolBar(btnSet, btnClear, btnResume);

       // Создать обработчик событий от кнопок
       // на панеле инструментов
       EventHandler<ActionEvent> btnHandler = (ae) -> response.setText(((Button) ae.getTarget()).getText());

       // Установить обработчики событий действия
       // для кнопок на панели инструментов
       btnSet.setOnAction(btnHandler);
       btnClear.setOnAction(btnHandler);
       btnResume.setOnAction(btnHandler);
   }
}
