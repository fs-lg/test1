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

public  class  InToPrePage{

@FXML
private TextField txt_IntoPre_in;

@FXML
private Button btn_InToPre;

@FXML
private TextArea txt_InToPre_out;

@FXML
private Button btn_backToMenu;

@FXML
    void press_btn_InToPre(ActionEvent event) {
    Control cn =new Control(txt_IntoPre_in.getText());
    if(cn.isIn()) {


        Change_InToPos_InToPre ch = new Change_InToPos_InToPre(txt_IntoPre_in.getText());
        ch.in_To_pos_To_pre(2);
        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("Convert Successfully!!");
        alert5.showAndWait();

        txt_InToPre_out.setText(ch.res.toString());
        Recording r=new Recording();
        r.add(1);
        NewRecording r2=new NewRecording();
        r2.add(1);
    }
    else {
        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("please enter a correct infix!!");
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
