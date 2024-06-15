package screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class AdminTourListScreen {

    @FXML
    public void handleSampleTourAction(ActionEvent event) throws Exception {
        final String BST_FXML_FILE_PATH = "/views/admin/sampletour.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(BST_FXML_FILE_PATH));
        Parent parent = fxmlLoader.load();
        Stage stage = (Stage)((MenuItem) event.getSource()).getParentPopup().getOwnerWindow();
        stage.setScene(new Scene(parent));
        stage.show();
    }
    @FXML
    public void initialize() {

    }

}