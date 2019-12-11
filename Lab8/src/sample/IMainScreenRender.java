package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public interface IMainScreenRender {
     Button getDivideButton();
     Button getClearButton();
     TextField getFirstTextField();
     TextField getSecondTextField();
     Label getResultLabel();
     void render();
}
