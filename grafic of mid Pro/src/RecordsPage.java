import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RecordsPage {

    @FXML
    private Button btn_UpToDown;

    @FXML
    private Button btn_DownToUp;

    @FXML
    private Button btn_backToMenu;
    @FXML
    private TextArea txt_res_records;

    @FXML
    void press_btn_DownToUp(ActionEvent event) {
        Recording recording=new Recording();
        txt_res_records.setText(recording.sort_DownToUP());
    }

    @FXML
    void press_btn_UpToDown(ActionEvent event) {
        Recording recording=new Recording();
        txt_res_records.setText(recording.sort_UpToDown());


    }

    @FXML
    void press_btn_backToMenu(ActionEvent event) {

        Stage stage = (Stage) btn_backToMenu.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("wrong address for html file!!");
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
