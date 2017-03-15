import javafx.scene.text.Text;
import java.util.Objects;

/**
 * Created by ${Eric} on 2017-03-14.
 */
class LoginClass {

    String loginCheck(Text loginResponse, String username, String password) {
        String returnString;
        if(Objects.equals(username, "Admin") && Objects.equals(password, "admin")){
            loginResponse.setFill(javafx.scene.paint.Color.GREEN);
            returnString = "Access granted";
        } else {
            loginResponse.setFill(javafx.scene.paint.Color.RED);
            returnString = "Access denied!";
        }
        return returnString;
    }
}

