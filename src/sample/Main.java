package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sample.Blocks.Block;
import sample.Blocks.BlockController;

import java.io.File;
import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

/*      Jag vet att det här funkar!!!
        Group g = new Group();
        g.getChildren().add(new Block(new BlockController()));
        Scene s = new Scene(g, 300, 300);
        primaryStage.setScene(s);*/


        primaryStage.setScene(new Scene(root));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
