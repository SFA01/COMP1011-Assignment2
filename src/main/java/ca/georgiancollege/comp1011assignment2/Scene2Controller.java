package ca.georgiancollege.comp1011assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class Scene2Controller {

    @FXML
    private TableColumn<?, ?> Code;

    @FXML
    private TableColumn<?, ?> Continent;

    @FXML
    private TableColumn<?, ?> Name;

    @FXML
    private Button OnClickedButton2;

    @FXML
    private TableColumn<?, ?> Population;

    @FXML
    private TableColumn<?, ?> Region;

    @FXML
    private TableView<?> Table;

    @FXML
    void OnClickedButton2(ActionEvent event) {

    }

    @FXML
    void OnViewCanvasClicked(ActionEvent event) throws IOException
    {
        SceneManager.Instance().changeScene(event,"Scene2.fxml");

        SceneManager.Instance().changeScene(event,"Scene1.fxml");
    }


}

