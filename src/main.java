import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
/**
 * Created by ${Eric} on 2017-03-14.
 */
public class main extends Application {
    private LoginView loginView = new LoginView();

        @Override
        public void start(Stage primaryStage) throws Exception {
        //Create grid, load CSS and set title
            GridPane gridPane = new GridPane();
            gridPane.setAlignment(Pos.CENTER);
            gridPane.setHgap(10);
            gridPane.setVgap(10);
            gridPane.setPadding(new Insets(25, 25, 25, 25));
            gridPane.setId("pane");
            Scene scene = new Scene(gridPane, 300, 275);
            scene.getStylesheets().add("resources/loginStyle.css");
            primaryStage.setTitle("JavaFX Welcome");

        //Load login screen
            loginView.loadLogin(scene, gridPane);

        //Set scene
            primaryStage.setScene(scene);
            primaryStage.show();
        }
}
