package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Test extends AnchorPane {

    @FXML private ImageView t;

    public Test(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Test.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        //t.setImage(new Image("file:resources/BRICK16.png"));

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

    }


    @FXML
    protected void onClick(Event event){

    }
}
