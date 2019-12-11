package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        IController mainController = new MainController(new MainScreenRender(primaryStage));
        mainController.present();
    }
}
