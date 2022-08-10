import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PreToPosPage {

    @FXML
    private TextField txt_PreToPos;

    @FXML
    private Button btn_PreToPos_change;

    @FXML
    private TextArea txt_PreToPos_Res;

    @FXML
    private Button btn_PreToPos_backToMenu;

    @FXML
    void press_btn_PreToPos_backToMenu(ActionEvent event) {
        Stage stage = (Stage) btn_PreToPos_backToMenu.getScene().getWindow();
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

    @FXML
    void press_btn_PreToPos_change(ActionEvent event) {
        Control cn =new Control( txt_PreToPos.getText());
        if(cn.isPre()) {


           Change_PreToPos ch = new Change_PreToPos( txt_PreToPos.getText());

            ch.preToPos();
            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Hey You");
            alert5.setContentText("Convert Successfully!!");
            alert5.showAndWait();

            txt_PreToPos_Res.setText(ch.getRes());
            Recording r=new Recording();
            r.add(5);
            NewRecording r2=new NewRecording();
            r2.add(5);

        }
        else {
            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Hey You");
            alert5.setContentText("please enter a correct Prefix!!");
            alert5.showAndWait();

        }

    }

}
