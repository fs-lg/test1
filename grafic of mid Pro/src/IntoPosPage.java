import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class IntoPosPage {

    @FXML
    private TextField txt_InToPos_In;

    @FXML
    private Button btn_change_inToPos;
    @FXML
    private TextArea txt_Res_InToPos;
    @FXML
    private Button btn_backToMenu;

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

    @FXML
    void press_btn_change_inToPos(ActionEvent event) {
        Control cn =new Control(txt_InToPos_In.getText());
        if(cn.isIn()) {


            Change_InToPos_InToPre ch = new Change_InToPos_InToPre(txt_InToPos_In.getText());
            ch.in_To_pos_To_pre(1);
            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Hey You");
            alert5.setContentText("Convert Successfully!!");
            alert5.showAndWait();
            txt_Res_InToPos.setText(ch.res.toString());
            Recording r=new Recording();
            r.add(0);
            NewRecording r2=new NewRecording();
            r2.add(0);

        }
        else {
            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Hey You");
            alert5.setContentText("please enter a correct infix!!");
            alert5.showAndWait();

        }

//
//        Stage stage = (Stage) btn_change_inToPos.getScene().getWindow();
//        stage.close();
//        Stage primaryStage = new Stage();
//        AnchorPane root = null;
//        try {
//            root = (AnchorPane) FXMLLoader.load(getClass().getResource("IntoPosPage.fxml"));
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("wrong address for html file!!");
//        }
//        Scene scene = new Scene(root, 800, 500);
//        primaryStage.setScene(scene);
//        primaryStage.show();



    }

}
