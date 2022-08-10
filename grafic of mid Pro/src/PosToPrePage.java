import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PosToPrePage {

    @FXML
    private TextField txt_PosToPre_in;

    @FXML
    private Button btn_convert_PosToPre;

    @FXML
    private TextArea txt_posTopre_out;
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
    void press_btn_convert_PosToPre(ActionEvent event) {
        Control cn =new Control(txt_PosToPre_in.getText());
        if(cn.isPos()) {


            Change_PosToPre ch = new Change_PosToPre(txt_PosToPre_in.getText());
            ch.posToPre(1);
            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Hey You");
            alert5.setContentText("Convert Successfully!!");
            alert5.showAndWait();
            txt_posTopre_out.setText(ch.res);
            Recording r=new Recording();
            r.add(2);
            NewRecording r2=new NewRecording();
            r2.add(2);
        }
        else {
            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Hey You");
            alert5.setContentText("please enter a correct postfix!!");
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
