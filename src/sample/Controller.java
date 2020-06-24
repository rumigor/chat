package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    public void exitClick(ActionEvent actionEvent) {
        Stage stage = (Stage) textArea.getScene().getWindow();
        stage.close();
    }

    public void sendMessage(ActionEvent actionEvent) {
        textArea.appendText("user: " + textField.getText() + "\n");
        textField.clear();
    }

    public void unsupported(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Внимание!");
        alert.setHeaderText("Сообщение системы: ");
        alert.setContentText("К сожалению, функция пока не работает!");

        alert.showAndWait();
    }
}
