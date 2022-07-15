package ca.georgiancollege.comp1011assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Scene2Controller implements Initializable{

    @FXML
    private TableColumn<?, ?> CodeColumn;

    @FXML
    private TableColumn<?, ?> ContinentColumn;

    @FXML
    private TableColumn<?, ?> NameColumn;

    @FXML
    private Button Button2;

    @FXML
    private TableColumn<?, ?> PopulationColumn;

    @FXML
    private TableColumn<?, ?> RegionColumn;

    @FXML
    private TableView<CountryData> Table;

    @FXML
    void OnClickedButton2(ActionEvent event) throws IOException {

        //Here I am doing to change the scenes

        SceneManager.Instance().changeScene(event,"Scene1.fxml");

    }

    //Here I am doing it to populate the table with data
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        CodeColumn.setCellValueFactory(new PropertyValueFactory<>("Code"));
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ContinentColumn.setCellValueFactory(new PropertyValueFactory<>("continent"));
        RegionColumn.setCellValueFactory(new PropertyValueFactory<>("region"));
        PopulationColumn.setCellValueFactory(new PropertyValueFactory<>("population"));
        Table.getItems().addAll(DBManager.Instance().readTable());

    }
}

