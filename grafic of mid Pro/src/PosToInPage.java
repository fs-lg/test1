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

public class PosToInPage {

    @FXML
    private Button btn_PosToIn_convert;

    @FXML
    private TextField txt_PosToIn_In;

    @FXML
    private TextArea txt_PosToIn_Res;

    @FXML
    private Button btn_backToMenu;

    @FXML
    void press_btn_PosToIn_convert(ActionEvent event) {
        Control cn =new Control(txt_PosToIn_In.getText());
        if(cn.isPos()) {


            Change_PosToPre ch = new Change_PosToPre(txt_PosToIn_In.getText());
            ch.posToPre(1);
            //System.out.println(ch.toString(ch.output,ch.k));

            Change_PreToIn ch2=new Change_PreToIn(ch.output[0]);
            ch2.preToIn();

            txt_PosToIn_Res.setText(ch2.getRes());
            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Hey You");
            alert5.setContentText("Convert Successfully!!");
            alert5.showAndWait();
            Recording r=new Recording();
            r.add(3);
            NewRecording r2=new NewRecording();
            r2.add(3);
        }
        else {
            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Hey You");
            alert5.setContentText("please enter a correct postfix!!");
            alert5.showAndWait();

        }


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
