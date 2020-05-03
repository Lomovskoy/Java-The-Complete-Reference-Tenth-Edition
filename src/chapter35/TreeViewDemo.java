package chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * В этой программе демонстрируются
 * применение элемента управления типа ThreeView.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2020
 */
public class TreeViewDemo extends Application {

    Label response;

    public static void main(String[] args) {
        // Запустить Java-FX приложени, вызовом метода launch()
        launch(args);
    }

    // Переопределить метод start
    @Override
    public void start(Stage stage) {

        // Присвоить заголовок подмосткам
        stage.setTitle("Three View Demo");

        // Используется панель поточной компоновки типа FlowPane
        // в качестве корневого узла и установить промежутки между
        // элементами управления по горизонтали и по вертикали равным 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управленияы по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 310, 460);

        // Установить сцену на подмостках
        stage.setScene(myScene);

        // Создать метку извещающую о состоянии
        // выбранного элемента из дерева
        response = new Label("No Selection");

        // Создать узлы дерева, начиная с корневого узла
        TreeItem<String> tiRoot = new TreeItem<>("Food");

        // Ввести поддеревья начиная с узла фруктов
        TreeItem<String> tiFruit = new TreeItem<>("Fruit");

        // Построить узел яблок
        TreeItem<String> tiApples = new TreeItem<>("Apples");

        // Ввести порожденные узлы сортов яблок в узел яблок
        tiApples.getChildren().add(new TreeItem<>("Fuji"));
        tiApples.getChildren().add(new TreeItem<>("Winesap"));
        tiApples.getChildren().add(new TreeItem<>("Jonathan"));

        // Ввести порожденные узлы фркутов в узел фркутов
        tiFruit.getChildren().add(tiApples);
        tiFruit.getChildren().add(new TreeItem<>("Pears"));
        tiFruit.getChildren().add(new TreeItem<>("Oranges"));

        // Ввести узел фруктов в корневой узел
        tiRoot.getChildren().add(tiFruit);

        // Ввести узел овощей
        TreeItem<String> tiFVegetables = new TreeItem<>("Vegetables");
        tiFVegetables.getChildren().add(new TreeItem<>("Corn"));
        tiFVegetables.getChildren().add(new TreeItem<>("Peas"));
        tiFVegetables.getChildren().add(new TreeItem<>("Broccoli"));
        tiFVegetables.getChildren().add(new TreeItem<>("Beans"));

        // Ввести узел овощей в корневой узел
        tiRoot.getChildren().add(tiFVegetables);

        // Ввести узел орехов
        TreeItem<String> tiNuts = new TreeItem<>("Nuts");
        tiNuts.getChildren().add(new TreeItem<>("WalNuts"));
        tiNuts.getChildren().add(new TreeItem<>("PeaNuts"));
        tiNuts.getChildren().add(new TreeItem<>("Pecans"));

        // Ввести узел овощей в корневой узел
        tiRoot.getChildren().add(tiNuts);

        // Создать представление, построенного дерева
        TreeView<String> tvFoot = new TreeView<>(tiRoot);

        // Получить модель выбора для древовидного представления
        MultipleSelectionModel<TreeItem<String>> tvSelModel = tvFoot.getSelectionModel();

        // Использовать приёмник событий изменения,
        // чтобы оперативно реагироватьт на выбор
        // элементов в древавидномпредставлении.
        tvSelModel.selectedItemProperty().addListener((changed, oldVal, newVal) -> {
            // Отобразить выбранный элемент и
            // полный путь от него к корневому узлу
            if (newVal != null){
                // Построить весь путь к выбранному элементу
                StringBuilder path = new StringBuilder(newVal.getValue());

                TreeItem<String> tmp = newVal.getParent();

                while (tmp != null){
                    path.insert(0, tmp.getValue() + " -> ");
                    tmp = tmp.getParent();
                }

                // Отобразить выбранный элемент
                // и полный путь к нему
                response.setText("Selection is " + newVal.getValue() +
                        "\nComplete path is " + path);
            }
        });

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(tvFoot, response);

        // Показать подмостки и сцену на них
        stage.show();
    }
}
