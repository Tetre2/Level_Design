package sample.Blocks;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sample.Blocks.BlockController;

import java.io.IOException;

public class RotatableBlock extends AnchorPane {

    @FXML private ImageView block = new ImageView();
    @FXML private Button buttonLeft = new Button();
    @FXML private Button buttonRight = new Button();
    @FXML private ImageView imageViewRight = new ImageView();
    @FXML private ImageView imageViewLeft = new ImageView();
    private BlockController bc;

    public RotatableBlock(BlockController bc) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RotatableBlock.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        Image i = new Image("sample/resources/BRICK16.png");
        //block.setImage(i);
        imageViewLeft.setImage(i);
        //imageViewLeft.setImage(new Image("sample/resources/arrowLeft.png"));
        //imageViewRight.setImage(new Image("sample/resources/arrowRight.png"));

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        //block.setImage(sprite.getImage());//TODO
        this.bc = bc;

    }
}
