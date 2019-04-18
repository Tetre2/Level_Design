package sample.Blocks;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Block extends AnchorPane {

    @FXML private ImageView block;
    private BlockController bc;
    private String ID = "";


    public Block(BlockController bc) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Block.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        block.setImage(new Image("sample/resources/BRICK16.png"));

        //block.setImage(sprite.getImage());//TODO


        this.bc = bc;

    }

    public ImageView getBlock() {
        return block;
    }

    @FXML
    public void setOnClick() {

        if(bc.getImage() != null) {
            block.setImage(bc.getImage());
        }else{
            System.out.println("No Block Seleckted");
        }

    }



}
