
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu {

    @FXML
    private Button btn_InToPos;

    @FXML
    private Button btn_PosToIn;

    @FXML
    private Button btn_PreToIn;

    @FXML
    private Button btn_IntoPer;

    @FXML
    private Button btn_PosToPre;

    @FXML
    private Button btn_PreToPos;

    @FXML
    private Button btn_exit;
    @FXML
    private Button btn_records;

    @FXML
    void press_btn_records(ActionEvent event){
        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("Welcome!");
        alert5.showAndWait();
        Stage stage = (Stage) btn_InToPos.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("Records.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("wrong address for fxml file!!");
        }
        Scene scene = new Scene(root, 550, 400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @FXML
    void press_btn_InToPos(ActionEvent event) throws IOException {
        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("Welcome!");
        alert5.showAndWait();
        Stage stage = (Stage) btn_InToPos.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("IntoPosPage.fxml"));
        Scene scene = new Scene(root, 550, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void press_btn_IntoPer(ActionEvent event) {
        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("Welcome!");
        alert5.showAndWait();
        Stage stage = (Stage) btn_PosToPre.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("InToPrePage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("wrong address for fxml file!!");
        }
        Scene scene = new Scene(root, 550, 400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @FXML
    void press_btn_PosToIn(ActionEvent event) {
        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("Welcome!");
        alert5.showAndWait();
        Stage stage = (Stage) btn_PosToPre.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("PosToInPage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("wrong address for fxml file!!");
        }
        Scene scene = new Scene(root, 550, 400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @FXML
    void press_btn_PosToPre(ActionEvent event) {
        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("Welcome!");
        alert5.showAndWait();
        Stage stage = (Stage) btn_PosToPre.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("PosToPre.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("wrong address for fxml file!!");
        }
        Scene scene = new Scene(root, 550, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void press_btn_PreToIn(ActionEvent event) {
         Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("Welcome!");
        alert5.showAndWait();
        Stage stage = (Stage) btn_PreToPos.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("PreToInPage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("wrong address for fxml file!!");
        }
        Scene scene = new Scene(root, 550, 400);
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    @FXML
    void press_btn_PreToPos(ActionEvent event) {
        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert5.setTitle("Hey You");
        alert5.setContentText("Welcome!");
        alert5.showAndWait();
        Stage stage = (Stage) btn_PreToPos.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("PreToPosPage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("wrong address for fxml file!!");
        }
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @FXML
    void press_btn_exit(ActionEvent event) {



    }

}
