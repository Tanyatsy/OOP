package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainScreenRender implements IMainScreenRender{
    private Button btnDivide;
    private Button btnClear;
    private TextField tfNumber1;
    private TextField tfNumber2;
    private Label lblAnswer;

    private Stage stage;

    public MainScreenRender(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void render() {
        tfNumber1 = new TextField();
        tfNumber1.setPromptText("Write a number");
        tfNumber1.setFocusTraversable(false);
        tfNumber2 = new TextField();
        tfNumber2.setPromptText("Write a number");
        tfNumber2.setFocusTraversable(false);
        btnDivide = new Button("Divide");
        lblAnswer = new Label("Result");
        btnClear = new Button("Clear");
        lblAnswer.setAlignment(Pos.CENTER);
        lblAnswer.setStyle("-fx-border-color: #100; -fx-padding: 15px;");
        FlowPane flow = new FlowPane(tfNumber1, tfNumber2,btnDivide,lblAnswer,btnClear);
        flow.setAlignment(Pos.CENTER);// Alignment
        flow.setVgap(10);  // Vertical gap between nodes in pixels
        flow.setHgap(10);  // Horizontal gap between nodes in pixels

        stage.setScene(new Scene(flow, 320, 200));
        stage.setTitle("Calc");
        stage.show();
    }

    @Override
    public Button getDivideButton() {
        return btnDivide;
    }

    @Override
    public Button getClearButton() {
        return btnClear;
    }

    @Override
    public TextField getFirstTextField() {
        return tfNumber1;
    }

    @Override
    public TextField getSecondTextField() {
        return tfNumber2;
    }

    @Override
    public Label getResultLabel() {
        return lblAnswer;
    }
}
