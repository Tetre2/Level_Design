package sample.Blocks;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sample.Sprites.Sprite;

import java.io.IOException;

public class Block extends AnchorPane {

    @FXML private ImageView block = new ImageView();
    private BlockController bc;

    public Block(BlockController bc) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Block.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        block.setImage(new Image("sample/resources/BRICK16.png"));

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        //block.setImage(sprite.getImage());//TODO


        this.bc = bc;

    }


}
