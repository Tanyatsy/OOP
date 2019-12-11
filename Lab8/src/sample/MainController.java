package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController implements IController {
    private IMainScreenRender mainScreenRender;

    public MainController(IMainScreenRender mainScreenRender) {
        this.mainScreenRender = mainScreenRender;
    }

    @Override
    public void present() {
        mainScreenRender.render();
        initTextFields();
    }

    private void initTextFields() {
        TextField tfNumber1 = mainScreenRender.getFirstTextField();
        TextField tfNumber2 = mainScreenRender.getSecondTextField();
        Button btnClear = mainScreenRender.getClearButton();
        Button btnDivide = mainScreenRender.getDivideButton();
        Label lblAnswer = mainScreenRender.getResultLabel();

        tfNumber1.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if (!tfNumber1.getText().matches("[0-9]*"))
                    tfNumber1.setStyle("-fx-border-color:  red;");
                else tfNumber1.setStyle("-fx-border-color:  transparent;");
            }

        });
        tfNumber2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if (!tfNumber2.getText().matches("[0-9]*"))
                    tfNumber2.setStyle("-fx-border-color:  red;");
                else tfNumber2.setStyle("-fx-border-color:  transparent;");
            }
            // we only care about loosing focus
            // check condition and apply necessay style

        });
        btnClear.setOnAction(event -> {
            tfNumber1.setText("");
            tfNumber2.setText("");
            lblAnswer.setText("Result");
            tfNumber1.requestFocus();
            tfNumber2.setStyle("-fx-border-color:  transparent;");
            tfNumber1.setStyle("-fx-border-color:  transparent;");
        });
        btnDivide.setOnAction(event -> {
            try {

                double num1 = Integer.parseInt(tfNumber1.getText());
                double num2 = Integer.parseInt(tfNumber2.getText());

                double c = num1 / num2;

                checkNumber(num2);

                lblAnswer.setText("" + c);

            } catch (ArithmeticException e) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Error: " + e.getMessage() + " ");
                a.show();

            } catch (NumberFormatException e) {
                Alert a = new Alert(Alert.AlertType.WARNING);
                a.setContentText("Error: " + e.getMessage() + " ");
                a.show();

            } catch (NewException e) {
                Alert a = new Alert(Alert.AlertType.WARNING);
                a.setContentText(" Custom Error: " + e.getMessage() + " ");
                a.show();
            }

        });
    }

    public static void checkNumber(double x) throws NewException{
        if(x == 13)
            throw new NewException("Please do not write this number!");
        if(x == 0)
            throw new NewException("You cannot divide by zero!");
    }
}
