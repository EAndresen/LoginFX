import java.util.Objects;

/**
 * Created by ${Eric} on 2017-03-14.
 */
class LoginClass {
    String loginCheck(String username, String password) {
        String returnString;
        if(Objects.equals(username, "Admin") && Objects.equals(password, "admin")){
            returnString = "Access granted";
        } else {
            returnString = "Access denied!";
        }
        return returnString;
    }
}

