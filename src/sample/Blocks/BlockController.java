package sample.Blocks;


import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class BlockController {

    private static Image image;
    private List<RotatableBlock> rotatableBlocks;

    public BlockController() {
        rotatableBlocks = new ArrayList<>();


    }


    public void addRoatatbelBlcok(RotatableBlock rb){
        rotatableBlocks.add(rb);
    }

    public void setOnlySelected(RotatableBlock rb){

        for (RotatableBlock rotatableBlock : rotatableBlocks) {
            if( !rotatableBlock.equals(rb) ){
                rotatableBlock.setSelected(false);
            }
        }

    }


    public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }
}
