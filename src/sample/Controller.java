package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import sample.Blocks.Block;
import sample.Blocks.BlockController;
import sample.Blocks.RotatableBlock;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private GridPane gridPaneCanvas;
    @FXML private FlowPane flowPanePallet;
    private List<Block> blocks = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //flowPaneCanvas = new FlowPane();
        int size = 16;

        BlockController bc = new BlockController();
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                Block b = new Block(bc); //TODO
                blocks.add(b);
                gridPaneCanvas.setConstraints(b, col, row);
                gridPaneCanvas.getChildren().add(b);
            }
        }


        RotatableBlock r = new RotatableBlock(bc);
        flowPanePallet.getChildren().add(r);

    }
}
