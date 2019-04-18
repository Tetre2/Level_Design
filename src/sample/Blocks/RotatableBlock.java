package sample.Blocks;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RotatableBlock extends AnchorPane {

    @FXML private ImageView block;
    @FXML private Button buttonLeft;
    @FXML private Button buttonRight;
    @FXML private ImageView imageViewRight;
    @FXML private ImageView imageViewLeft;
    @FXML private AnchorPane back;

    private List<Image> blocks;
    private BlockController bc;
    private boolean isSelected = false;

    public RotatableBlock(BlockController bc) {

        blocks = new ArrayList<>();
        bc.addRoatatbelBlcok(this);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RotatableBlock.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        Image i = new Image("sample/resources/BRICK16.png");
        blocks.add(i);
        i = new Image("sample/resources/Brick2.png");
        blocks.add(i);

        block.setImage(blocks.get(0));

        this.bc = bc;
    }

    @FXML
    public void goLeft() {

        //System.out.println("index of: " + blocks.indexOf(block.getImage()));

        int i = (blocks.indexOf(block.getImage()) + 1);
        //System.out.println("+ 1: " + i);
        int i2 = i % blocks.size();
        //System.out.println("mod: " + i2);
        block.setImage(blocks.get( i2 ));

        setOnClick();
    }



    @FXML
    public void goRight() {
        //System.out.println("index of: " + blocks.indexOf(block.getImage()));

        int i = (blocks.indexOf(block.getImage()) + blocks.size() - 1);
        //System.out.println("+size - 1: " + i);
        int i2 = i % blocks.size();
        //System.out.println("mod: " + i2);
        block.setImage(blocks.get( i2 ));

        setOnClick();
    }

    @FXML
    public void setOnClick() {
        bc.setImage(block.getImage());
        setSelected(true);
        //System.out.println("selected: " + block.getImage().getUrl());
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;

        if(selected){//sets the style based on Block.css
            back.getStyleClass().add("selected");
        }else {
            back.getStyleClass().add("notselected");
        }

        bc.setOnlySelected(this);
    }
}
