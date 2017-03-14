import java.util.Objects;

/**
 * Created by erica on 2017-03-14.
 */
public class LoginClass {

    public String loginCheck(String username, String password) {
        String returnString;
        if(Objects.equals(username, "Admin") && Objects.equals(password, "admin")){
            returnString = "Access granted";
        } else {
            returnString = "Access denied!";
        }
        return returnString;
    }
}

