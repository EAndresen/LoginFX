import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * Created by ${Eric} on 2017-03-15.
 */
class LoginView {
    private Button btn = new Button();
    private LoginClass loginClass = new LoginClass();

        void loadLogin(Scene scene, GridPane gridPane){

        //Create node objects
            Text sceneTitle = new Text("Welcome");
            sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            gridPane.add(sceneTitle, 0, 0, 2, 1);
            sceneTitle.setId("welcome-text");

            Label userName = new Label("User Name:");
            gridPane.add(userName, 0, 1);

            TextField userTextField = new TextField();
            gridPane.add(userTextField, 1, 1);

            Label pw = new Label("Password:");
            gridPane.add(pw, 0, 2);

            PasswordField pwBox = new PasswordField();
            gridPane.add(pwBox, 1, 2);

        //Add login button
            btn.setText("Sign in");
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            gridPane.add(hbBtn, 1, 4);

        //Login response
            Text loginResponse = new Text();
            gridPane.add(loginResponse, 1, 6);
            loginResponse.setId("loginResponse");

        //Button kick listener
            btn.setOnAction((ActionEvent e) -> {
                String username = userTextField.getText();
                String password = pwBox.getText();
                String access = loginClass.loginCheck(loginResponse, username, password);
                loginResponse.setText(access);
            });

        //Enter-key listener
            scene.setOnKeyPressed(keyEvent -> {
                if (keyEvent.getCode() == KeyCode.ENTER)  {
                    btn.fire();
                }
            });
    }
}
